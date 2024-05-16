package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class zapatos extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.zapatos");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.zapatos.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.sql.SQL _sql = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public String  _initialize(b4a.example.zapatos __ref,anywheresoftware.b4a.BA _ba,String _nombrebdd) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="zapatos";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_nombrebdd}));}
RDebugUtils.currentLine=1114112;
 //BA.debugLineNum = 1114112;BA.debugLine="Public Sub Initialize(nombreBdd As String)";
RDebugUtils.currentLine=1114113;
 //BA.debugLineNum = 1114113;BA.debugLine="sql.Initialize(File.DirInternal, nombreBdd, True)";
__ref._sql /*anywheresoftware.b4a.sql.SQL*/ .Initialize(__c.File.getDirInternal(),_nombrebdd,__c.True);
RDebugUtils.currentLine=1114114;
 //BA.debugLineNum = 1114114;BA.debugLine="sql.ExecNonQuery(\"CREATE TABLE IF NOT EXISTS zapa";
__ref._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("CREATE TABLE IF NOT EXISTS zapatos( id INT PRIMARY KEY, nombreProducto TEXT(50), precioUnitario NUMBER(10,3), iva NUMBER(5,3), stock NUMBER(10,3) )");
RDebugUtils.currentLine=1114115;
 //BA.debugLineNum = 1114115;BA.debugLine="End Sub";
return "";
}
public boolean  _update(b4a.example.zapatos __ref,int _id,String _nombreproducto,double _preciounitario,double _iva,double _stock) throws Exception{
__ref = this;
RDebugUtils.currentModule="zapatos";
if (Debug.shouldDelegate(ba, "update", false))
	 {return ((Boolean) Debug.delegate(ba, "update", new Object[] {_id,_nombreproducto,_preciounitario,_iva,_stock}));}
RDebugUtils.currentLine=1441792;
 //BA.debugLineNum = 1441792;BA.debugLine="Public Sub Update(id As Int, nombreProducto As Str";
RDebugUtils.currentLine=1441793;
 //BA.debugLineNum = 1441793;BA.debugLine="sql.ExecNonQuery2(\"UPDATE zapatos SET nombreProdu";
__ref._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery2("UPDATE zapatos SET nombreProducto = ?, precioUnitario = ?, iva = ?, stock = ? WHERE id = ?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_nombreproducto),(Object)(_preciounitario),(Object)(_iva),(Object)(_stock),(Object)(_id)}));
RDebugUtils.currentLine=1441794;
 //BA.debugLineNum = 1441794;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=1441795;
 //BA.debugLineNum = 1441795;BA.debugLine="End Sub";
return false;
}
public boolean  _delete(b4a.example.zapatos __ref,int _id) throws Exception{
__ref = this;
RDebugUtils.currentModule="zapatos";
if (Debug.shouldDelegate(ba, "delete", false))
	 {return ((Boolean) Debug.delegate(ba, "delete", new Object[] {_id}));}
RDebugUtils.currentLine=1507328;
 //BA.debugLineNum = 1507328;BA.debugLine="Public Sub Delete(id As Int) As Boolean";
RDebugUtils.currentLine=1507329;
 //BA.debugLineNum = 1507329;BA.debugLine="sql.ExecNonQuery(\"DELETE FROM zapatos WHERE id =";
__ref._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("DELETE FROM zapatos WHERE id = "+BA.NumberToString(_id));
RDebugUtils.currentLine=1507330;
 //BA.debugLineNum = 1507330;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=1507331;
 //BA.debugLineNum = 1507331;BA.debugLine="End Sub";
return false;
}
public b4a.example.zapato  _create(b4a.example.zapatos __ref,int _id,String _nombreproducto,double _preciounitario,double _iva,double _stock) throws Exception{
__ref = this;
RDebugUtils.currentModule="zapatos";
if (Debug.shouldDelegate(ba, "create", false))
	 {return ((b4a.example.zapato) Debug.delegate(ba, "create", new Object[] {_id,_nombreproducto,_preciounitario,_iva,_stock}));}
b4a.example.zapato _p = null;
RDebugUtils.currentLine=1179648;
 //BA.debugLineNum = 1179648;BA.debugLine="Public Sub Create(id As Int, nombreProducto As Str";
RDebugUtils.currentLine=1179649;
 //BA.debugLineNum = 1179649;BA.debugLine="sql.ExecNonQuery2(\"INSERT INTO zapatos( id, nombr";
__ref._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery2("INSERT INTO zapatos( id, nombreProducto, precioUnitario, iva, stock ) VALUES ( ?, ?, ?, ?, ? )",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_id),(Object)(_nombreproducto),(Object)(_preciounitario),(Object)(_iva),(Object)(_stock)}));
RDebugUtils.currentLine=1179650;
 //BA.debugLineNum = 1179650;BA.debugLine="Dim p As Zapato";
_p = new b4a.example.zapato();
RDebugUtils.currentLine=1179651;
 //BA.debugLineNum = 1179651;BA.debugLine="p.Initialize";
_p._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=1179652;
 //BA.debugLineNum = 1179652;BA.debugLine="p.Id = id";
_p._id /*int*/  = _id;
RDebugUtils.currentLine=1179653;
 //BA.debugLineNum = 1179653;BA.debugLine="p.NombreProducto = nombreProducto";
_p._nombreproducto /*String*/  = _nombreproducto;
RDebugUtils.currentLine=1179654;
 //BA.debugLineNum = 1179654;BA.debugLine="p.PrecioUnitario = precioUnitario";
_p._preciounitario /*double*/  = _preciounitario;
RDebugUtils.currentLine=1179655;
 //BA.debugLineNum = 1179655;BA.debugLine="p.IVA = iva";
_p._iva /*double*/  = _iva;
RDebugUtils.currentLine=1179656;
 //BA.debugLineNum = 1179656;BA.debugLine="p.Stock = stock";
_p._stock /*double*/  = _stock;
RDebugUtils.currentLine=1179657;
 //BA.debugLineNum = 1179657;BA.debugLine="Return p";
if (true) return _p;
RDebugUtils.currentLine=1179658;
 //BA.debugLineNum = 1179658;BA.debugLine="End Sub";
return null;
}
public b4a.example.zapato  _read_byid(b4a.example.zapatos __ref,int _id) throws Exception{
__ref = this;
RDebugUtils.currentModule="zapatos";
if (Debug.shouldDelegate(ba, "read_byid", false))
	 {return ((b4a.example.zapato) Debug.delegate(ba, "read_byid", new Object[] {_id}));}
b4a.example.zapato _p = null;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cursor = null;
RDebugUtils.currentLine=1310720;
 //BA.debugLineNum = 1310720;BA.debugLine="Public Sub Read_ById(id As Int) As Zapato";
RDebugUtils.currentLine=1310721;
 //BA.debugLineNum = 1310721;BA.debugLine="Dim p As Zapato";
_p = new b4a.example.zapato();
RDebugUtils.currentLine=1310722;
 //BA.debugLineNum = 1310722;BA.debugLine="Dim cursor As Cursor";
_cursor = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=1310723;
 //BA.debugLineNum = 1310723;BA.debugLine="cursor = sql.ExecQuery(\"SELECT id, nombreProducto";
_cursor = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(__ref._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT id, nombreProducto, precioUnitario, iva, stock FROM zapatos WHERE id = "+BA.NumberToString(_id))));
RDebugUtils.currentLine=1310724;
 //BA.debugLineNum = 1310724;BA.debugLine="If cursor.RowCount > 0 Then";
if (_cursor.getRowCount()>0) { 
RDebugUtils.currentLine=1310725;
 //BA.debugLineNum = 1310725;BA.debugLine="cursor.Position = 0";
_cursor.setPosition((int) (0));
RDebugUtils.currentLine=1310726;
 //BA.debugLineNum = 1310726;BA.debugLine="p.Initialize";
_p._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=1310727;
 //BA.debugLineNum = 1310727;BA.debugLine="p.Id = cursor.GetInt(\"id\")";
_p._id /*int*/  = _cursor.GetInt("id");
RDebugUtils.currentLine=1310728;
 //BA.debugLineNum = 1310728;BA.debugLine="p.NombreProducto = cursor.GetString(\"nombreProdu";
_p._nombreproducto /*String*/  = _cursor.GetString("nombreProducto");
RDebugUtils.currentLine=1310729;
 //BA.debugLineNum = 1310729;BA.debugLine="p.PrecioUnitario = cursor.GetDouble(\"precioUnita";
_p._preciounitario /*double*/  = _cursor.GetDouble("precioUnitario");
RDebugUtils.currentLine=1310730;
 //BA.debugLineNum = 1310730;BA.debugLine="p.IVA = cursor.GetDouble(\"iva\")";
_p._iva /*double*/  = _cursor.GetDouble("iva");
RDebugUtils.currentLine=1310731;
 //BA.debugLineNum = 1310731;BA.debugLine="p.Stock = cursor.GetDouble(\"stock\")";
_p._stock /*double*/  = _cursor.GetDouble("stock");
 };
RDebugUtils.currentLine=1310734;
 //BA.debugLineNum = 1310734;BA.debugLine="Return p";
if (true) return _p;
RDebugUtils.currentLine=1310735;
 //BA.debugLineNum = 1310735;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4a.example.zapatos __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="zapatos";
RDebugUtils.currentLine=1048576;
 //BA.debugLineNum = 1048576;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=1048577;
 //BA.debugLineNum = 1048577;BA.debugLine="Private sql As SQL";
_sql = new anywheresoftware.b4a.sql.SQL();
RDebugUtils.currentLine=1048578;
 //BA.debugLineNum = 1048578;BA.debugLine="End Sub";
return "";
}
public b4a.example.zapato[]  _read_all(b4a.example.zapatos __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="zapatos";
if (Debug.shouldDelegate(ba, "read_all", false))
	 {return ((b4a.example.zapato[]) Debug.delegate(ba, "read_all", null));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _cursor = null;
b4a.example.zapato[] _zapatos = null;
int _i = 0;
b4a.example.zapato _p = null;
RDebugUtils.currentLine=1245184;
 //BA.debugLineNum = 1245184;BA.debugLine="Public Sub Read_All() As Zapato()";
RDebugUtils.currentLine=1245185;
 //BA.debugLineNum = 1245185;BA.debugLine="Dim cursor As Cursor";
_cursor = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=1245186;
 //BA.debugLineNum = 1245186;BA.debugLine="cursor = sql.ExecQuery(\"SELECT id, nombreProducto";
_cursor = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(__ref._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT id, nombreProducto, precioUnitario, iva, stock FROM zapatos ORDER BY nombreProducto")));
RDebugUtils.currentLine=1245187;
 //BA.debugLineNum = 1245187;BA.debugLine="Dim zapatos(cursor.RowCount - 1) As Zapato ' Crea";
_zapatos = new b4a.example.zapato[(int) (_cursor.getRowCount()-1)];
{
int d0 = _zapatos.length;
for (int i0 = 0;i0 < d0;i0++) {
_zapatos[i0] = new b4a.example.zapato();
}
}
;
RDebugUtils.currentLine=1245189;
 //BA.debugLineNum = 1245189;BA.debugLine="For i = 0 To cursor.RowCount - 1";
{
final int step4 = 1;
final int limit4 = (int) (_cursor.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=1245190;
 //BA.debugLineNum = 1245190;BA.debugLine="cursor.Position = i";
_cursor.setPosition(_i);
RDebugUtils.currentLine=1245191;
 //BA.debugLineNum = 1245191;BA.debugLine="Dim p As Zapato";
_p = new b4a.example.zapato();
RDebugUtils.currentLine=1245192;
 //BA.debugLineNum = 1245192;BA.debugLine="p.Initialize";
_p._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=1245193;
 //BA.debugLineNum = 1245193;BA.debugLine="p.Id = cursor.GetInt(\"id\")";
_p._id /*int*/  = _cursor.GetInt("id");
RDebugUtils.currentLine=1245194;
 //BA.debugLineNum = 1245194;BA.debugLine="p.NombreProducto = cursor.GetString(\"nombreProdu";
_p._nombreproducto /*String*/  = _cursor.GetString("nombreProducto");
RDebugUtils.currentLine=1245195;
 //BA.debugLineNum = 1245195;BA.debugLine="p.PrecioUnitario = cursor.GetDouble(\"precioUnita";
_p._preciounitario /*double*/  = _cursor.GetDouble("precioUnitario");
RDebugUtils.currentLine=1245196;
 //BA.debugLineNum = 1245196;BA.debugLine="p.IVA = cursor.GetDouble(\"iva\")";
_p._iva /*double*/  = _cursor.GetDouble("iva");
RDebugUtils.currentLine=1245197;
 //BA.debugLineNum = 1245197;BA.debugLine="p.Stock = cursor.GetDouble(\"stock\")";
_p._stock /*double*/  = _cursor.GetDouble("stock");
RDebugUtils.currentLine=1245198;
 //BA.debugLineNum = 1245198;BA.debugLine="zapatos(i) = p ' Asignamos cada Producto al arre";
_zapatos[_i] = _p;
 }
};
RDebugUtils.currentLine=1245201;
 //BA.debugLineNum = 1245201;BA.debugLine="Return zapatos ' Devolvemos el arreglo de Product";
if (true) return _zapatos;
RDebugUtils.currentLine=1245202;
 //BA.debugLineNum = 1245202;BA.debugLine="End Sub";
return null;
}
}