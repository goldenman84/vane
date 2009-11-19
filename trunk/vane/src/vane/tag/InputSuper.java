package vane.tag;

/**
 * @ClassName: InputSuper
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author vane zhaoxiong1003@126.com
 * @date 2009-10-23 上午10:54:41
 * 
 */
public class InputSuper extends VaneTag {
	
	private static final long serialVersionUID = -3861108021469471872L;
	private String name = null;
	private String type = null;
	private String accept = null;
	private String accesskey = null;
	private String align = null;
	private String alt = null;
	private String border = null;
	private String checked = null;
	private String classstyle = null;
	private String dir = null;
	private String disabled = null;
	private String height = null;
	private String id = null;
	private String ismap = null;
	private String istyle = null;
	private String lang = null;
	private String maxlength = null;
	private String onblur = null;
	private String onchange = null;
	private String onclick = null;
	private String ondblclick = null;
	private String onfocus = null;
	private String onhelp = null;
	private String onkeydown = null;
	private String onkeypress = null;
	private String onmousedown = null;
	private String onmousemove = null;
	private String onmouseout = null;
	private String onmouseup = null;
	private String onselect = null;
	private String readonly = null;
	private String size = null;
	private String width = null;
	private String value = null;
	private String title = null;
	private String tabindex = null;
	private String style = null;
	private String src = null;

	protected String getBaseStr() {
		String basestr = " ";
		if (name != null)
			basestr += "name=\"" + name + "\"";
		if (id != null)
			basestr += " id=\"" + id + "\"";
		if (accept != null)
			basestr += " accept=\"" + accept + "\"";
		if (accesskey != null)
			basestr += " accesskey=\"" + accesskey + "\"";
		if (align != null)
			basestr += " align=\"" + align + "\"";
		if (alt != null)
			basestr += " alt=\"" + alt + " \"";
		if (border != null)
			basestr += " border=\"" + border + "\"";
		if (checked != null)
			basestr += " checked=\"" + checked + "\"";
		if (classstyle != null)
			basestr += " class=\"" + classstyle + "\"";
		if (dir != null)
			basestr += " dir=\"" + dir + "\"";
		if (disabled != null)
			basestr += " disabled=\"" + disabled + "\"";
		if (height != null)
			basestr += " height=\"" + height + "\"";
		if (ismap != null)
			basestr += " ismap=\"" + ismap + "\"";
		if (istyle != null)
			basestr += " istyle=\"" + istyle + "\"";
		if (lang != null)
			basestr += " lang=\"" + lang + "\"";
		if (maxlength != null)
			basestr += " maxlength=\"" + maxlength + "\"";
//		if (type!=null)
//			basestr+=" type=\""+type+"\"";
		// ---------------------------------------------------
		// if(onblur!=null)
		// basestr+=" onblur= \""+onblur+" \" ";
		if (onchange != null)
			basestr += " onchange=\"" + onchange + "\"";
		if (onclick != null)
			basestr += " onclick=\"" + onclick + "\"";
		if (ondblclick != null)
			basestr += " ondblclick=\"" + ondblclick + "\"";
		if (onfocus != null)
			basestr += " onfocus=\"" + onfocus + "\"";
		if (onhelp != null)
			basestr += " onhelp=\"" + onhelp + "\"";
		if (onkeydown != null)
			basestr += " onkeydown=\"" + onkeydown + "\"";
		if (onkeypress != null)
			basestr += " onkeypress=\"" + onkeypress + "\"";
		if (onmousedown != null)
			basestr += " onmousedown=\"" + onmousedown + "\"";
		if (onmousemove != null)
			basestr += " onmousemove=\"" + onmousemove + "\"";
		if (onmouseout != null)
			basestr += " onmouseout=\"" + onmouseout + "\"";
		if (onmouseup != null)
			basestr += " onmouseup=\"" + onmouseup + "\"";
		if (onselect != null)
			basestr += " onselect=\"" + onselect + "\"";
		// ---------------------------------------------------
		if (readonly != null)
			basestr += " readonly=\"" + readonly + "\"";
		if (size != null)
			basestr += " size=\"" + size + "\"";
		if (width != null)
			basestr += " width=\"" + width + "\"";
		if (value != null)
			basestr += " value=\"" + value + "\"";
		if (title != null)
			basestr += " title=\"" + title + "\"";
		if (tabindex != null)
			basestr += " tabindex=\"" + tabindex + "\"";
		if (style != null)
			basestr += " style=\"" + style + "\"";
		if (src != null)
			basestr += " src=\"" + src + "\"";
		return basestr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAccept() {
		return accept;
	}

	public void setAccept(String accept) {
		this.accept = accept;
	}

	public String getAccesskey() {
		return accesskey;
	}

	public void setAccesskey(String accesskey) {
		this.accesskey = accesskey;
	}

	public String getAlign() {
		return align;
	}

	public void setAlign(String align) {
		this.align = align;
	}

	public String getAlt() {
		return alt;
	}

	public void setAlt(String alt) {
		this.alt = alt;
	}

	public String getBorder() {
		return border;
	}

	public void setBorder(String border) {
		this.border = border;
	}

	public String getChecked() {
		return checked;
	}

	public void setChecked(String checked) {
		this.checked = checked;
	}

	public String getClassstyle() {
		return classstyle;
	}

	public void setClassstyle(String classstyle) {
		this.classstyle = classstyle;
	}

	public String getDir() {
		return dir;
	}

	public void setDir(String dir) {
		this.dir = dir;
	}

	public String getDisabled() {
		return disabled;
	}

	public void setDisabled(String disabled) {
		this.disabled = disabled;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getIsmap() {
		return ismap;
	}

	public void setIsmap(String ismap) {
		this.ismap = ismap;
	}

	public String getIstyle() {
		return istyle;
	}

	public void setIstyle(String istyle) {
		this.istyle = istyle;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public String getMaxlength() {
		return maxlength;
	}

	public void setMaxlength(String maxlength) {
		this.maxlength = maxlength;
	}

	public String getOnblur() {
		return onblur;
	}

	public void setOnblur(String onblur) {
		this.onblur = onblur;
	}

	public String getOnchange() {
		return onchange;
	}

	public void setOnchange(String onchange) {
		this.onchange = onchange;
	}

	public String getOnclick() {
		return onclick;
	}

	public void setOnclick(String onclick) {
		this.onclick = onclick;
	}

	public String getOndblclick() {
		return ondblclick;
	}

	public void setOndblclick(String ondblclick) {
		this.ondblclick = ondblclick;
	}

	public String getOnfocus() {
		return onfocus;
	}

	public void setOnfocus(String onfocus) {
		this.onfocus = onfocus;
	}

	public String getOnhelp() {
		return onhelp;
	}

	public void setOnhelp(String onhelp) {
		this.onhelp = onhelp;
	}

	public String getOnkeydown() {
		return onkeydown;
	}

	public void setOnkeydown(String onkeydown) {
		this.onkeydown = onkeydown;
	}

	public String getOnkeypress() {
		return onkeypress;
	}

	public void setOnkeypress(String onkeypress) {
		this.onkeypress = onkeypress;
	}

	public String getOnmousedown() {
		return onmousedown;
	}

	public void setOnmousedown(String onmousedown) {
		this.onmousedown = onmousedown;
	}

	public String getOnmousemove() {
		return onmousemove;
	}

	public void setOnmousemove(String onmousemove) {
		this.onmousemove = onmousemove;
	}

	public String getOnmouseout() {
		return onmouseout;
	}

	public void setOnmouseout(String onmouseout) {
		this.onmouseout = onmouseout;
	}

	public String getOnmouseup() {
		return onmouseup;
	}

	public void setOnmouseup(String onmouseup) {
		this.onmouseup = onmouseup;
	}

	public String getOnselect() {
		return onselect;
	}

	public void setOnselect(String onselect) {
		this.onselect = onselect;
	}

	public String getReadonly() {
		return readonly;
	}

	public void setReadonly(String readonly) {
		this.readonly = readonly;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getWidth() {
		return width;
	}

	public void setWidth(String width) {
		this.width = width;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTabindex() {
		return tabindex;
	}

	public void setTabindex(String tabindex) {
		this.tabindex = tabindex;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public String getSrc() {
		return src;
	}

	public void setSrc(String src) {
		this.src = src;
	}

}
