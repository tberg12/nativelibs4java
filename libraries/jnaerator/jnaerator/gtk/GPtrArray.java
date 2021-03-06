package gtk;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * <i>native declaration : glib-2.0/glib/garray.h:21</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Gtk") 
public class GPtrArray extends StructObject {
	static {
		BridJ.register();
	}
	/**
	 * Failed to convert value pdata of type gpointer*<br>
	 * C type : gpointer*
	 */
	/** C type : guint */
	@Field(1) 
	public int len() {
		return this.io.getIntField(this, 1);
	}
	/** C type : guint */
	@Field(1) 
	public GPtrArray len(int len) {
		this.io.setIntField(this, 1, len);
		return this;
	}
	public GPtrArray() {
		super();
	}
	public GPtrArray(Pointer pointer) {
		super(pointer);
	}
}
