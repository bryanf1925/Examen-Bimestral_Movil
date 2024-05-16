
package b4a.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class zapato {
    public static RemoteObject myClass;
	public zapato() {
	}
    public static PCBA staticBA = new PCBA(null, zapato.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _id = RemoteObject.createImmutable(0);
public static RemoteObject _nombreproducto = RemoteObject.createImmutable("");
public static RemoteObject _preciounitario = RemoteObject.createImmutable(0);
public static RemoteObject _iva = RemoteObject.createImmutable(0);
public static RemoteObject _stock = RemoteObject.createImmutable(0);
public static b4a.example.main _main = null;
public static b4a.example.starter _starter = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"Id",_ref.getField(false, "_id"),"IVA",_ref.getField(false, "_iva"),"NombreProducto",_ref.getField(false, "_nombreproducto"),"PrecioUnitario",_ref.getField(false, "_preciounitario"),"stock",_ref.getField(false, "_stock")};
}
}