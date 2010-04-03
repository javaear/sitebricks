package com.google.sitebricks;

/**
 * @author Dhanji R. Prasanna (dhanji@gmail com)
 */
class Template {
  private final Kind templateKind;
  private final String text;

  public Template(Kind templateKind, String text) {
    this.templateKind = templateKind;
    this.text = text;
  }

  public Kind getKind() {
    return templateKind;
  }

  public String getText() {
    return text;
  }

  public static enum Kind {
    HTML, XML, FLAT,;

    /**
     * Returns whether a given template should be treated as html, xml or flat
     * (currently by looking at file extension)
     */
    public static Kind kindOf(String template) {
      if (template.endsWith(".html") || template.endsWith(".xhtml"))
        return HTML;
      else if (template.endsWith(".xml"))
        return XML;
      else
        return FLAT;
    }
    
  }
}
