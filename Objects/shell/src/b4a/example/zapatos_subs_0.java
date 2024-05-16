package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class zapatos_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private sql As SQL";
zapatos._sql = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL");__ref.setField("_sql",zapatos._sql);
 //BA.debugLineNum = 3;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _create(RemoteObject __ref,RemoteObject _id,RemoteObject _nombreproducto,RemoteObject _preciounitario,RemoteObject _iva,RemoteObject _stock) throws Exception{
try {
		Debug.PushSubsStack("Create (zapatos) ","zapatos",3,__ref.getField(false, "ba"),__ref,12);
if (RapidSub.canDelegate("create")) { return __ref.runUserSub(false, "zapatos","create", __ref, _id, _nombreproducto, _preciounitario, _iva, _stock);}
RemoteObject _p = RemoteObject.declareNull("b4a.example.zapato");
Debug.locals.put("id", _id);
Debug.locals.put("nombreProducto", _nombreproducto);
Debug.locals.put("precioUnitario", _preciounitario);
Debug.locals.put("iva", _iva);
Debug.locals.put("stock", _stock);
 BA.debugLineNum = 12;BA.debugLine="Public Sub Create(id As Int, nombreProducto As Str";
Debug.ShouldStop(2048);
 BA.debugLineNum = 13;BA.debugLine="sql.ExecNonQuery2(\"INSERT INTO zapatos( id, nombr";
Debug.ShouldStop(4096);
__ref.getField(false,"_sql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("INSERT INTO zapatos( id, nombreProducto, precioUnitario, iva, stock ) VALUES ( ?, ?, ?, ?, ? )")),(Object)(zapatos.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {5},new Object[] {(_id),(_nombreproducto),(_preciounitario),(_iva),(_stock)})))));
 BA.debugLineNum = 14;BA.debugLine="Dim p As Zapato";
Debug.ShouldStop(8192);
_p = RemoteObject.createNew ("b4a.example.zapato");Debug.locals.put("p", _p);
 BA.debugLineNum = 15;BA.debugLine="p.Initialize";
Debug.ShouldStop(16384);
_p.runClassMethod (b4a.example.zapato.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 16;BA.debugLine="p.Id = id";
Debug.ShouldStop(32768);
_p.setField ("_id" /*RemoteObject*/ ,_id);
 BA.debugLineNum = 17;BA.debugLine="p.NombreProducto = nombreProducto";
Debug.ShouldStop(65536);
_p.setField ("_nombreproducto" /*RemoteObject*/ ,_nombreproducto);
 BA.debugLineNum = 18;BA.debugLine="p.PrecioUnitario = precioUnitario";
Debug.ShouldStop(131072);
_p.setField ("_preciounitario" /*RemoteObject*/ ,_preciounitario);
 BA.debugLineNum = 19;BA.debugLine="p.IVA = iva";
Debug.ShouldStop(262144);
_p.setField ("_iva" /*RemoteObject*/ ,_iva);
 BA.debugLineNum = 20;BA.debugLine="p.Stock = stock";
Debug.ShouldStop(524288);
_p.setField ("_stock" /*RemoteObject*/ ,_stock);
 BA.debugLineNum = 21;BA.debugLine="Return p";
Debug.ShouldStop(1048576);
if (true) return _p;
 BA.debugLineNum = 22;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _delete(RemoteObject __ref,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("Delete (zapatos) ","zapatos",3,__ref.getField(false, "ba"),__ref,70);
if (RapidSub.canDelegate("delete")) { return __ref.runUserSub(false, "zapatos","delete", __ref, _id);}
Debug.locals.put("id", _id);
 BA.debugLineNum = 70;BA.debugLine="Public Sub Delete(id As Int) As Boolean";
Debug.ShouldStop(32);
 BA.debugLineNum = 71;BA.debugLine="sql.ExecNonQuery(\"DELETE FROM zapatos WHERE id =";
Debug.ShouldStop(64);
__ref.getField(false,"_sql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("DELETE FROM zapatos WHERE id = "),_id)));
 BA.debugLineNum = 72;BA.debugLine="Return True";
Debug.ShouldStop(128);
if (true) return zapatos.__c.getField(true,"True");
 BA.debugLineNum = 73;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _nombrebdd) throws Exception{
try {
		Debug.PushSubsStack("Initialize (zapatos) ","zapatos",3,__ref.getField(false, "ba"),__ref,6);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "zapatos","initialize", __ref, _ba, _nombrebdd);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("nombreBdd", _nombrebdd);
 BA.debugLineNum = 6;BA.debugLine="Public Sub Initialize(nombreBdd As String)";
Debug.ShouldStop(32);
 BA.debugLineNum = 7;BA.debugLine="sql.Initialize(File.DirInternal, nombreBdd, True)";
Debug.ShouldStop(64);
__ref.getField(false,"_sql" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)(zapatos.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(_nombrebdd),(Object)(zapatos.__c.getField(true,"True")));
 BA.debugLineNum = 8;BA.debugLine="sql.ExecNonQuery(\"CREATE TABLE IF NOT EXISTS zapa";
Debug.ShouldStop(128);
__ref.getField(false,"_sql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("CREATE TABLE IF NOT EXISTS zapatos( id INT PRIMARY KEY, nombreProducto TEXT(50), precioUnitario NUMBER(10,3), iva NUMBER(5,3), stock NUMBER(10,3) )")));
 BA.debugLineNum = 9;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _read_all(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Read_All (zapatos) ","zapatos",3,__ref.getField(false, "ba"),__ref,25);
if (RapidSub.canDelegate("read_all")) { return __ref.runUserSub(false, "zapatos","read_all", __ref);}
RemoteObject _cursor = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _zapatos = null;
int _i = 0;
RemoteObject _p = RemoteObject.declareNull("b4a.example.zapato");
 BA.debugLineNum = 25;BA.debugLine="Public Sub Read_All() As Zapato()";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 26;BA.debugLine="Dim cursor As Cursor";
Debug.ShouldStop(33554432);
_cursor = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("cursor", _cursor);
 BA.debugLineNum = 27;BA.debugLine="cursor = sql.ExecQuery(\"SELECT id, nombreProducto";
Debug.ShouldStop(67108864);
_cursor = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), __ref.getField(false,"_sql" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT id, nombreProducto, precioUnitario, iva, stock FROM zapatos ORDER BY nombreProducto"))));Debug.locals.put("cursor", _cursor);
 BA.debugLineNum = 28;BA.debugLine="Dim zapatos(cursor.RowCount - 1) As Zapato ' Crea";
Debug.ShouldStop(134217728);
_zapatos = RemoteObject.createNewArray ("b4a.example.zapato", new int[] {RemoteObject.solve(new RemoteObject[] {_cursor.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue()}, new Object[]{});Debug.locals.put("zapatos", _zapatos);
 BA.debugLineNum = 30;BA.debugLine="For i = 0 To cursor.RowCount - 1";
Debug.ShouldStop(536870912);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {_cursor.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 31;BA.debugLine="cursor.Position = i";
Debug.ShouldStop(1073741824);
_cursor.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 32;BA.debugLine="Dim p As Zapato";
Debug.ShouldStop(-2147483648);
_p = RemoteObject.createNew ("b4a.example.zapato");Debug.locals.put("p", _p);
 BA.debugLineNum = 33;BA.debugLine="p.Initialize";
Debug.ShouldStop(1);
_p.runClassMethod (b4a.example.zapato.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 34;BA.debugLine="p.Id = cursor.GetInt(\"id\")";
Debug.ShouldStop(2);
_p.setField ("_id" /*RemoteObject*/ ,_cursor.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("id"))));
 BA.debugLineNum = 35;BA.debugLine="p.NombreProducto = cursor.GetString(\"nombreProdu";
Debug.ShouldStop(4);
_p.setField ("_nombreproducto" /*RemoteObject*/ ,_cursor.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("nombreProducto"))));
 BA.debugLineNum = 36;BA.debugLine="p.PrecioUnitario = cursor.GetDouble(\"precioUnita";
Debug.ShouldStop(8);
_p.setField ("_preciounitario" /*RemoteObject*/ ,_cursor.runMethod(true,"GetDouble",(Object)(RemoteObject.createImmutable("precioUnitario"))));
 BA.debugLineNum = 37;BA.debugLine="p.IVA = cursor.GetDouble(\"iva\")";
Debug.ShouldStop(16);
_p.setField ("_iva" /*RemoteObject*/ ,_cursor.runMethod(true,"GetDouble",(Object)(RemoteObject.createImmutable("iva"))));
 BA.debugLineNum = 38;BA.debugLine="p.Stock = cursor.GetDouble(\"stock\")";
Debug.ShouldStop(32);
_p.setField ("_stock" /*RemoteObject*/ ,_cursor.runMethod(true,"GetDouble",(Object)(RemoteObject.createImmutable("stock"))));
 BA.debugLineNum = 39;BA.debugLine="zapatos(i) = p ' Asignamos cada Producto al arre";
Debug.ShouldStop(64);
_zapatos.setArrayElement ( /*RemoteObject*/ _p,BA.numberCast(int.class, _i));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 42;BA.debugLine="Return zapatos ' Devolvemos el arreglo de Product";
Debug.ShouldStop(512);
if (true) return _zapatos;
 BA.debugLineNum = 43;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _read_byid(RemoteObject __ref,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("Read_ById (zapatos) ","zapatos",3,__ref.getField(false, "ba"),__ref,46);
if (RapidSub.canDelegate("read_byid")) { return __ref.runUserSub(false, "zapatos","read_byid", __ref, _id);}
RemoteObject _p = RemoteObject.declareNull("b4a.example.zapato");
RemoteObject _cursor = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
Debug.locals.put("id", _id);
 BA.debugLineNum = 46;BA.debugLine="Public Sub Read_ById(id As Int) As Zapato";
Debug.ShouldStop(8192);
 BA.debugLineNum = 47;BA.debugLine="Dim p As Zapato";
Debug.ShouldStop(16384);
_p = RemoteObject.createNew ("b4a.example.zapato");Debug.locals.put("p", _p);
 BA.debugLineNum = 48;BA.debugLine="Dim cursor As Cursor";
Debug.ShouldStop(32768);
_cursor = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("cursor", _cursor);
 BA.debugLineNum = 49;BA.debugLine="cursor = sql.ExecQuery(\"SELECT id, nombreProducto";
Debug.ShouldStop(65536);
_cursor = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), __ref.getField(false,"_sql" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT id, nombreProducto, precioUnitario, iva, stock FROM zapatos WHERE id = "),_id))));Debug.locals.put("cursor", _cursor);
 BA.debugLineNum = 50;BA.debugLine="If cursor.RowCount > 0 Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean(">",_cursor.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 51;BA.debugLine="cursor.Position = 0";
Debug.ShouldStop(262144);
_cursor.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 52;BA.debugLine="p.Initialize";
Debug.ShouldStop(524288);
_p.runClassMethod (b4a.example.zapato.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 53;BA.debugLine="p.Id = cursor.GetInt(\"id\")";
Debug.ShouldStop(1048576);
_p.setField ("_id" /*RemoteObject*/ ,_cursor.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("id"))));
 BA.debugLineNum = 54;BA.debugLine="p.NombreProducto = cursor.GetString(\"nombreProdu";
Debug.ShouldStop(2097152);
_p.setField ("_nombreproducto" /*RemoteObject*/ ,_cursor.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("nombreProducto"))));
 BA.debugLineNum = 55;BA.debugLine="p.PrecioUnitario = cursor.GetDouble(\"precioUnita";
Debug.ShouldStop(4194304);
_p.setField ("_preciounitario" /*RemoteObject*/ ,_cursor.runMethod(true,"GetDouble",(Object)(RemoteObject.createImmutable("precioUnitario"))));
 BA.debugLineNum = 56;BA.debugLine="p.IVA = cursor.GetDouble(\"iva\")";
Debug.ShouldStop(8388608);
_p.setField ("_iva" /*RemoteObject*/ ,_cursor.runMethod(true,"GetDouble",(Object)(RemoteObject.createImmutable("iva"))));
 BA.debugLineNum = 57;BA.debugLine="p.Stock = cursor.GetDouble(\"stock\")";
Debug.ShouldStop(16777216);
_p.setField ("_stock" /*RemoteObject*/ ,_cursor.runMethod(true,"GetDouble",(Object)(RemoteObject.createImmutable("stock"))));
 };
 BA.debugLineNum = 60;BA.debugLine="Return p";
Debug.ShouldStop(134217728);
if (true) return _p;
 BA.debugLineNum = 61;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _update(RemoteObject __ref,RemoteObject _id,RemoteObject _nombreproducto,RemoteObject _preciounitario,RemoteObject _iva,RemoteObject _stock) throws Exception{
try {
		Debug.PushSubsStack("Update (zapatos) ","zapatos",3,__ref.getField(false, "ba"),__ref,64);
if (RapidSub.canDelegate("update")) { return __ref.runUserSub(false, "zapatos","update", __ref, _id, _nombreproducto, _preciounitario, _iva, _stock);}
Debug.locals.put("id", _id);
Debug.locals.put("nombreProducto", _nombreproducto);
Debug.locals.put("precioUnitario", _preciounitario);
Debug.locals.put("iva", _iva);
Debug.locals.put("stock", _stock);
 BA.debugLineNum = 64;BA.debugLine="Public Sub Update(id As Int, nombreProducto As Str";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 65;BA.debugLine="sql.ExecNonQuery2(\"UPDATE zapatos SET nombreProdu";
Debug.ShouldStop(1);
__ref.getField(false,"_sql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("UPDATE zapatos SET nombreProducto = ?, precioUnitario = ?, iva = ?, stock = ? WHERE id = ?")),(Object)(zapatos.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {5},new Object[] {(_nombreproducto),(_preciounitario),(_iva),(_stock),(_id)})))));
 BA.debugLineNum = 66;BA.debugLine="Return True";
Debug.ShouldStop(2);
if (true) return zapatos.__c.getField(true,"True");
 BA.debugLineNum = 67;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}