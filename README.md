# BBCode Bundle for Sublime Text

This is a fork of the [TextMate BBCode Bundle][1] by [Ryan Bates][2], Michael Dippery and Grayson Manley.

[1]: https://github.com/gmanley/BBCode.tmbundle
[2]: http://www.rybud.com/

## Snippet Keybindings

Keybindings are disabled by default, copy&uncomment the keybinds you need from the [Default (Windows).sublime-keymap](<./Default (Windows).sublime-keymap>) and [Default (OSX).sublime-keymap](<./Default (OSX).sublime-keymap>) files to your own keymap

Use `Cmd` on OS X and `Ctrl` on other platforms.

    B    Bold/UnBold
    I    Italic/UnItalicize

Use `Cmd+Ctrl` on OS X and `Ctrl+Shift` on other platforms.

    C    Color
    @    Size
    W    Wrap (in arbitrary tag)

## Tab Triggers

    code      create code block
    img       create image tag
    url       create URL (link) tag
    1         ordered list block
    *         unordered list block
    -         list item

## Color scheme

You might want to add the settings below to your `.sublime-color-scheme` file to correctly highlight nested emphasized scopes (change the colors to whatever fits your theme)

```json
"variables"    	:{
  "black3"   	: "hsl(  0,   0%,   3%)",
  "grey_base"	: "hsl(  0,   0%,  50%)",
}
"rules"     : [
  {"name":"||<-- Language: BBCode -->||" },
  {"name":"BBCode: Punctuation Separator (B/I/U/S)"    	,"foreground":"color(var(grey_base) alpha(5))","font_style":"regular"                            	,"scope":"meta.tag.any.bbcode"                                                     	},
  {"name":"BBCode: Bold+Italic"                        	,"foreground":"var(black3)"                   ,"font_style":"italic bold"                        	,"scope":"markup.bold && markup.italic"                                            	},
  {"name":"BBCode: Bold+      +Underline"              	,"foreground":"var(black3)"                   ,"font_style":"       bold underline"              	,"scope":"markup.bold &&                  markup.underline"                        	},
  {"name":"BBCode:      Italic+Underline"              	,"foreground":"var(black3)"                   ,"font_style":"italic      underline"              	,"scope":"               markup.italic && markup.underline"                        	},
  {"name":"BBCode: Bold+Italic+Underline"              	,"foreground":"var(black3)"                   ,"font_style":"italic bold underline"              	,"scope":"markup.bold && markup.italic && markup.underline"                        	},
  {"name":"BBCode: Bold+Italic+Underline+Strikethrough"	,"foreground":"var(black3)"                   ,"font_style":"italic bold underline strikethrough"	,"scope":"markup.bold && markup.italic && markup.underline && markup.strikethrough"	},
]
```
