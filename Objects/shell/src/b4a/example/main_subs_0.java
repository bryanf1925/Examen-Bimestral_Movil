package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,32);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 32;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 33;BA.debugLine="Activity.LoadLayout(\"Layout\")";
Debug.ShouldStop(1);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Layout")),main.mostCurrent.activityBA);
 BA.debugLineNum = 34;BA.debugLine="zapatos.Initialize(\"tienda.data\")";
Debug.ShouldStop(2);
main.mostCurrent._zapatos.runClassMethod (b4a.example.zapatos.class, "_initialize" /*RemoteObject*/ ,main.processBA,(Object)(RemoteObject.createImmutable("tienda.data")));
 BA.debugLineNum = 35;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,41);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 41;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(256);
 BA.debugLineNum = 43;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,37);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_resume");}
 BA.debugLineNum = 37;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(16);
 BA.debugLineNum = 39;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnactualizar_click() throws Exception{
try {
		Debug.PushSubsStack("BtnActualizar_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,55);
if (RapidSub.canDelegate("btnactualizar_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","btnactualizar_click");}
 BA.debugLineNum = 55;BA.debugLine="Private Sub BtnActualizar_Click";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 56;BA.debugLine="zapatos.Update(txtId.Text, txtNombreProducto.Text";
Debug.ShouldStop(8388608);
main.mostCurrent._zapatos.runClassMethod (b4a.example.zapatos.class, "_update" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, main.mostCurrent._txtid.runMethod(true,"getText"))),(Object)(main.mostCurrent._txtnombreproducto.runMethod(true,"getText")),(Object)(BA.numberCast(double.class, main.mostCurrent._txtpreciounitario.runMethod(true,"getText"))),(Object)(BA.numberCast(double.class, main.mostCurrent._txtiva.runMethod(true,"getText"))),(Object)(BA.numberCast(double.class, main.mostCurrent._txtstock.runMethod(true,"getText"))));
 BA.debugLineNum = 57;BA.debugLine="Msgbox(\"registro actualizado!!\",\"Ok\")";
Debug.ShouldStop(16777216);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("registro actualizado!!")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Ok"))),main.mostCurrent.activityBA);
 BA.debugLineNum = 58;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cmddelete_click() throws Exception{
try {
		Debug.PushSubsStack("cmdDelete_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,45);
if (RapidSub.canDelegate("cmddelete_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","cmddelete_click");}
 BA.debugLineNum = 45;BA.debugLine="Private Sub cmdDelete_Click";
Debug.ShouldStop(4096);
 BA.debugLineNum = 46;BA.debugLine="zapatos.Delete(txtId.Text)";
Debug.ShouldStop(8192);
main.mostCurrent._zapatos.runClassMethod (b4a.example.zapatos.class, "_delete" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, main.mostCurrent._txtid.runMethod(true,"getText"))));
 BA.debugLineNum = 47;BA.debugLine="txtId.Text = \"\"";
Debug.ShouldStop(16384);
main.mostCurrent._txtid.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 48;BA.debugLine="txtNombreProducto.Text= \"\"";
Debug.ShouldStop(32768);
main.mostCurrent._txtnombreproducto.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 49;BA.debugLine="txtprecioUnitario.Text= \"\"";
Debug.ShouldStop(65536);
main.mostCurrent._txtpreciounitario.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 50;BA.debugLine="txtIva.Text = \"\"";
Debug.ShouldStop(131072);
main.mostCurrent._txtiva.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 51;BA.debugLine="txtStock.Text= \"\"";
Debug.ShouldStop(262144);
main.mostCurrent._txtstock.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 52;BA.debugLine="Msgbox(\"Registro borrado !!\", \"OK\")";
Debug.ShouldStop(524288);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Registro borrado !!")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("OK"))),main.mostCurrent.activityBA);
 BA.debugLineNum = 53;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cmdinsert_click() throws Exception{
try {
		Debug.PushSubsStack("cmdInsert_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,73);
if (RapidSub.canDelegate("cmdinsert_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","cmdinsert_click");}
 BA.debugLineNum = 73;BA.debugLine="Private Sub cmdInsert_Click";
Debug.ShouldStop(256);
 BA.debugLineNum = 74;BA.debugLine="zapatos.Create(txtId.Text, txtNombreProducto.Text";
Debug.ShouldStop(512);
main.mostCurrent._zapatos.runClassMethod (b4a.example.zapatos.class, "_create" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, main.mostCurrent._txtid.runMethod(true,"getText"))),(Object)(main.mostCurrent._txtnombreproducto.runMethod(true,"getText")),(Object)(BA.numberCast(double.class, main.mostCurrent._txtpreciounitario.runMethod(true,"getText"))),(Object)(BA.numberCast(double.class, main.mostCurrent._txtiva.runMethod(true,"getText"))),(Object)(BA.numberCast(double.class, main.mostCurrent._txtstock.runMethod(true,"getText"))));
 BA.debugLineNum = 75;BA.debugLine="Msgbox(\"registro insertado !!\", \"Ok\")";
Debug.ShouldStop(1024);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("registro insertado !!")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Ok"))),main.mostCurrent.activityBA);
 BA.debugLineNum = 76;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cmdreadbyid_click() throws Exception{
try {
		Debug.PushSubsStack("cmdReadById_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,60);
if (RapidSub.canDelegate("cmdreadbyid_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","cmdreadbyid_click");}
RemoteObject _p = RemoteObject.declareNull("b4a.example.zapato");
 BA.debugLineNum = 60;BA.debugLine="Private Sub cmdReadById_Click";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 61;BA.debugLine="Dim p As Zapato= zapatos.Read_ById(txtId.Text)";
Debug.ShouldStop(268435456);
_p = main.mostCurrent._zapatos.runClassMethod (b4a.example.zapatos.class, "_read_byid" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, main.mostCurrent._txtid.runMethod(true,"getText"))));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 62;BA.debugLine="If p.IsInitialized Then";
Debug.ShouldStop(536870912);
if (_p.runMethod(true,"IsInitialized" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 63;BA.debugLine="txtId.Text = p.Id";
Debug.ShouldStop(1073741824);
main.mostCurrent._txtid.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_p.getField(true,"_id" /*RemoteObject*/ )));
 BA.debugLineNum = 64;BA.debugLine="txtNombreProducto.Text= p.NombreProducto";
Debug.ShouldStop(-2147483648);
main.mostCurrent._txtnombreproducto.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_p.getField(true,"_nombreproducto" /*RemoteObject*/ )));
 BA.debugLineNum = 65;BA.debugLine="txtprecioUnitario.Text= p.PrecioUnitario";
Debug.ShouldStop(1);
main.mostCurrent._txtpreciounitario.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_p.getField(true,"_preciounitario" /*RemoteObject*/ )));
 BA.debugLineNum = 66;BA.debugLine="txtIva.Text = p.IVA";
Debug.ShouldStop(2);
main.mostCurrent._txtiva.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_p.getField(true,"_iva" /*RemoteObject*/ )));
 BA.debugLineNum = 67;BA.debugLine="txtStock.Text= p.stock";
Debug.ShouldStop(4);
main.mostCurrent._txtstock.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_p.getField(true,"_stock" /*RemoteObject*/ )));
 }else {
 BA.debugLineNum = 69;BA.debugLine="Msgbox(\"producto no encontrado\", \"Error\")";
Debug.ShouldStop(16);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("producto no encontrado")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),main.mostCurrent.activityBA);
 };
 BA.debugLineNum = 71;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 22;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 23;BA.debugLine="Private txtId As EditText";
main.mostCurrent._txtid = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private txtNombreProducto As EditText";
main.mostCurrent._txtnombreproducto = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private txtprecioUnitario As EditText";
main.mostCurrent._txtpreciounitario = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private txtIva As EditText";
main.mostCurrent._txtiva = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private txtStock As EditText";
main.mostCurrent._txtstock = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private zapatos As Zapatos";
main.mostCurrent._zapatos = RemoteObject.createNew ("b4a.example.zapatos");
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
starter_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4a.example.main");
starter.myClass = BA.getDeviceClass ("b4a.example.starter");
zapato.myClass = BA.getDeviceClass ("b4a.example.zapato");
zapatos.myClass = BA.getDeviceClass ("b4a.example.zapatos");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 18;BA.debugLine="Private xui As XUI";
main._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}