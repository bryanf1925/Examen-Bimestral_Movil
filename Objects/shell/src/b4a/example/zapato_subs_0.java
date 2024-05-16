package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class zapato_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Public Id As Int";
zapato._id = RemoteObject.createImmutable(0);__ref.setField("_id",zapato._id);
 //BA.debugLineNum = 3;BA.debugLine="Public NombreProducto As String";
zapato._nombreproducto = RemoteObject.createImmutable("");__ref.setField("_nombreproducto",zapato._nombreproducto);
 //BA.debugLineNum = 4;BA.debugLine="Public PrecioUnitario As Double";
zapato._preciounitario = RemoteObject.createImmutable(0);__ref.setField("_preciounitario",zapato._preciounitario);
 //BA.debugLineNum = 5;BA.debugLine="Public IVA As Double";
zapato._iva = RemoteObject.createImmutable(0);__ref.setField("_iva",zapato._iva);
 //BA.debugLineNum = 6;BA.debugLine="Public stock As Double";
zapato._stock = RemoteObject.createImmutable(0);__ref.setField("_stock",zapato._stock);
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (zapato) ","zapato",2,__ref.getField(false, "ba"),__ref,11);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "zapato","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 11;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(1024);
 BA.debugLineNum = 13;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}