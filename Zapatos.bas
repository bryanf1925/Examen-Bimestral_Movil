B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=12.8
@EndOfDesignText@
Sub Class_Globals
	Private sql As SQL
End Sub

'Inicializa el objeto y crea la tabla si no existe
Public Sub Initialize(nombreBdd As String)
	sql.Initialize(File.DirInternal, nombreBdd, True)
	sql.ExecNonQuery("CREATE TABLE IF NOT EXISTS zapatos( id INT PRIMARY KEY, nombreProducto TEXT(50), precioUnitario NUMBER(10,3), iva NUMBER(5,3), stock NUMBER(10,3) )")
End Sub

'Crea un nuevo Producto en la base de datos
Public Sub Create(id As Int, nombreProducto As String, precioUnitario As Double, iva As Double, stock As Double) As Zapato
	sql.ExecNonQuery2("INSERT INTO zapatos( id, nombreProducto, precioUnitario, iva, stock ) VALUES ( ?, ?, ?, ?, ? )", Array As Object(id, nombreProducto, precioUnitario, iva, stock))
	Dim p As Zapato
	p.Initialize
	p.Id = id
	p.NombreProducto = nombreProducto
	p.PrecioUnitario = precioUnitario
	p.IVA = iva
	p.Stock = stock
	Return p
End Sub

'Lee todos los productos de la base de datos
Public Sub Read_All() As Zapato()
	Dim cursor As Cursor
	cursor = sql.ExecQuery("SELECT id, nombreProducto, precioUnitario, iva, stock FROM zapatos ORDER BY nombreProducto")
	Dim zapatos(cursor.RowCount - 1) As Zapato ' Creamos un arreglo de Productos con el tamaño del cursor
    
	For i = 0 To cursor.RowCount - 1
		cursor.Position = i
		Dim p As Zapato
		p.Initialize
		p.Id = cursor.GetInt("id")
		p.NombreProducto = cursor.GetString("nombreProducto")
		p.PrecioUnitario = cursor.GetDouble("precioUnitario")
		p.IVA = cursor.GetDouble("iva")
		p.Stock = cursor.GetDouble("stock")
		zapatos(i) = p ' Asignamos cada Producto al arreglo
	Next
    
	Return zapatos ' Devolvemos el arreglo de Productos
End Sub

'Lee un producto por su ID
Public Sub Read_ById(id As Int) As Zapato
	Dim p As Zapato
	Dim cursor As Cursor
	cursor = sql.ExecQuery("SELECT id, nombreProducto, precioUnitario, iva, stock FROM zapatos WHERE id = " & id)
	If cursor.RowCount > 0 Then
		cursor.Position = 0
		p.Initialize
		p.Id = cursor.GetInt("id")
		p.NombreProducto = cursor.GetString("nombreProducto")
		p.PrecioUnitario = cursor.GetDouble("precioUnitario")
		p.IVA = cursor.GetDouble("iva")
		p.Stock = cursor.GetDouble("stock")
		
	End If
	Return p
End Sub

'Actualiza un producto en la base de datos
Public Sub Update(id As Int, nombreProducto As String, precioUnitario As Double, iva As Double, stock As Double) As Boolean
	sql.ExecNonQuery2("UPDATE zapatos SET nombreProducto = ?, precioUnitario = ?, iva = ?, stock = ? WHERE id = ?", Array As Object(nombreProducto, precioUnitario, iva, stock, id))
	Return True
End Sub

'Elimina un producto de la base de datos por su ID
Public Sub Delete(id As Int) As Boolean
	sql.ExecNonQuery("DELETE FROM zapatos WHERE id = " & id)
	Return True
End Sub
