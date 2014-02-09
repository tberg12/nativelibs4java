package gtk;
import _GIOFuncs.GError;
import _GMarkupParser.GMarkupParseContext;
import _GMemVTable.gsize;
import gtk.GtkLibrary.gchar;
import gtk.GtkLibrary.gpointer;
import org.bridj.BridJ;
import org.bridj.Callback;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;
/**
 * GMarkupParser:<br>
 * @start_element: Callback to invoke when the opening tag of an element<br>
 *     is seen.<br>
 * @end_element: Callback to invoke when the closing tag of an element<br>
 *     is seen. Note that this is also called for empty tags like<br>
 *     <literal>&lt;empty/&gt;</literal>.<br>
 * @text: Callback to invoke when some text is seen (text is always<br>
 *     inside an element). Note that the text of an element may be spread<br>
 *     over multiple calls of this function. If the<br>
 *     %G_MARKUP_TREAT_CDATA_AS_TEXT flag is set, this function is also<br>
 *     called for the content of CDATA marked sections.<br>
 * @passthrough: Callback to invoke for comments, processing instructions<br>
 *     and doctype declarations; if you're re-writing the parsed document,<br>
 *     write the passthrough text back out in the same position. If the<br>
 *     %G_MARKUP_TREAT_CDATA_AS_TEXT flag is not set, this function is also<br>
 *     called for CDATA marked sections.<br>
 * @error: Callback to invoke when an error occurs.<br>
 * * Any of the fields in #GMarkupParser can be %NULL, in which case they<br>
 * will be ignored. Except for the @error function, any of these callbacks<br>
 * can set an error; in particular the %G_MARKUP_ERROR_UNKNOWN_ELEMENT,<br>
 * %G_MARKUP_ERROR_UNKNOWN_ATTRIBUTE, and %G_MARKUP_ERROR_INVALID_CONTENT<br>
 * errors are intended to be set from these callbacks. If you set an error<br>
 * from a callback, g_markup_parse_context_parse() will report that error<br>
 * back to its caller.<br>
 * <i>native declaration : glib-2.0/glib/gmarkup.h:108</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Gtk") 
public class _GMarkupParser extends StructObject {
	static {
		BridJ.register();
	}
	/**
	 * Called for open tags <foo bar="baz"><br>
	 * C type : start_element_callback*
	 */
	@Field(0) 
	public Pointer<_GMarkupParser.start_element_callback > start_element() {
		return this.io.getPointerField(this, 0);
	}
	/**
	 * Called for open tags <foo bar="baz"><br>
	 * C type : start_element_callback*
	 */
	@Field(0) 
	public _GMarkupParser start_element(Pointer<_GMarkupParser.start_element_callback > start_element) {
		this.io.setPointerField(this, 0, start_element);
		return this;
	}
	/**
	 * Called for close tags </foo><br>
	 * C type : end_element_callback*
	 */
	@Field(1) 
	public Pointer<_GMarkupParser.end_element_callback > end_element() {
		return this.io.getPointerField(this, 1);
	}
	/**
	 * Called for close tags </foo><br>
	 * C type : end_element_callback*
	 */
	@Field(1) 
	public _GMarkupParser end_element(Pointer<_GMarkupParser.end_element_callback > end_element) {
		this.io.setPointerField(this, 1, end_element);
		return this;
	}
	/**
	 * text is not nul-terminated<br>
	 * C type : text_callback*
	 */
	@Field(2) 
	public Pointer<_GMarkupParser.text_callback > text() {
		return this.io.getPointerField(this, 2);
	}
	/**
	 * text is not nul-terminated<br>
	 * C type : text_callback*
	 */
	@Field(2) 
	public _GMarkupParser text(Pointer<_GMarkupParser.text_callback > text) {
		this.io.setPointerField(this, 2, text);
		return this;
	}
	/**
	 * text is not nul-terminated.<br>
	 * C type : passthrough_callback*
	 */
	@Field(3) 
	public Pointer<_GMarkupParser.passthrough_callback > passthrough() {
		return this.io.getPointerField(this, 3);
	}
	/**
	 * text is not nul-terminated.<br>
	 * C type : passthrough_callback*
	 */
	@Field(3) 
	public _GMarkupParser passthrough(Pointer<_GMarkupParser.passthrough_callback > passthrough) {
		this.io.setPointerField(this, 3, passthrough);
		return this;
	}
	/**
	 * Called on error, including one set by other<br>
	 * methods in the vtable. The GError should not be freed.<br>
	 * C type : error_callback*
	 */
	@Field(4) 
	public Pointer<_GMarkupParser.error_callback > error() {
		return this.io.getPointerField(this, 4);
	}
	/**
	 * Called on error, including one set by other<br>
	 * methods in the vtable. The GError should not be freed.<br>
	 * C type : error_callback*
	 */
	@Field(4) 
	public _GMarkupParser error(Pointer<_GMarkupParser.error_callback > error) {
		this.io.setPointerField(this, 4, error);
		return this;
	}
	/** <i>native declaration : glib-2.0/glib/gmarkup.h</i> */
	public static abstract class start_element_callback extends Callback<start_element_callback > {
		public final void apply(Pointer<GMarkupParseContext > context, Pointer<gchar > element_name, Pointer<Pointer<gchar > > attribute_names, Pointer<Pointer<gchar > > attribute_values, gpointer user_data, Pointer<Pointer<GError > > error) {
			apply(Pointer.getPeer(context), Pointer.getPeer(element_name), Pointer.getPeer(attribute_names), Pointer.getPeer(attribute_values), Pointer.getPeer(user_data), Pointer.getPeer(error));
		}
		public abstract void apply(@Ptr long context, @Ptr long element_name, @Ptr long attribute_names, @Ptr long attribute_values, @Ptr long user_data, @Ptr long error);
	};
	/** <i>native declaration : glib-2.0/glib/gmarkup.h</i> */
	public static abstract class end_element_callback extends Callback<end_element_callback > {
		public final void apply(Pointer<GMarkupParseContext > context, Pointer<gchar > element_name, gpointer user_data, Pointer<Pointer<GError > > error) {
			apply(Pointer.getPeer(context), Pointer.getPeer(element_name), Pointer.getPeer(user_data), Pointer.getPeer(error));
		}
		public abstract void apply(@Ptr long context, @Ptr long element_name, @Ptr long user_data, @Ptr long error);
	};
	/** <i>native declaration : glib-2.0/glib/gmarkup.h</i> */
	public static abstract class text_callback extends Callback<text_callback > {
		public final void apply(Pointer<GMarkupParseContext > context, Pointer<gchar > text, gsize text_len, gpointer user_data, Pointer<Pointer<GError > > error) {
			apply(Pointer.getPeer(context), Pointer.getPeer(text), Pointer.getPeer(text_len), Pointer.getPeer(user_data), Pointer.getPeer(error));
		}
		public abstract void apply(@Ptr long context, @Ptr long text, @Ptr long text_len, @Ptr long user_data, @Ptr long error);
	};
	/** <i>native declaration : glib-2.0/glib/gmarkup.h</i> */
	public static abstract class passthrough_callback extends Callback<passthrough_callback > {
		public final void apply(Pointer<GMarkupParseContext > context, Pointer<gchar > passthrough_text, gsize text_len, gpointer user_data, Pointer<Pointer<GError > > error) {
			apply(Pointer.getPeer(context), Pointer.getPeer(passthrough_text), Pointer.getPeer(text_len), Pointer.getPeer(user_data), Pointer.getPeer(error));
		}
		public abstract void apply(@Ptr long context, @Ptr long passthrough_text, @Ptr long text_len, @Ptr long user_data, @Ptr long error);
	};
	/** <i>native declaration : glib-2.0/glib/gmarkup.h</i> */
	public static abstract class error_callback extends Callback<error_callback > {
		public final void apply(Pointer<GMarkupParseContext > context, Pointer<GError > error, gpointer user_data) {
			apply(Pointer.getPeer(context), Pointer.getPeer(error), Pointer.getPeer(user_data));
		}
		public abstract void apply(@Ptr long context, @Ptr long error, @Ptr long user_data);
	};
	public _GMarkupParser() {
		super();
	}
	public _GMarkupParser(Pointer pointer) {
		super(pointer);
	}
}