# BBCode Bundle for Sublime Text 2

This is a fork of the [TextMate BBCode Bundle][1] by [Ryan Bates][2], Michael Dippery and Grayson Manley.

[1]: https://github.com/gmanley/BBCode.tmbundle
[2]: http://www.rybud.com/

## Snippet Keybindings

Use `Cmd+Ctrl` on OS X and `Ctrl+Shift` on other platforms.

    B    Bold
    I    Italic
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

## Commands

Just one command is implemented so far: "Convert from Markdown." Currently, this only handles bold, italics, and inline (not reference) links.

A command to go from BBCode to Markdown and BBCode to HTML would be desirable but the author tends to write in Markdown as the "native" format and convert to other formats when necessary. If you're up for writing one...

Watts Martin <layotl@gmail.com>
