# SYNTAX TEST "Packages/BBCode/BBCode.sublime-syntax"

# 1 Test overall source match
#^^^^^^^^^^^^^^^^^^^^^^^^^^^ text.bbcode

# 2 Test emphases
[b]bold[/b]                           #
# <-                                  meta.tag.any.bbcode
#^^                                   meta.tag.any.bbcode
#      ^^^^                           meta.tag.any.bbcode
# ^^^^                                markup.bold
[i]italic[/i]                         #
# <-                                  meta.tag.any.bbcode
#^^                                   meta.tag.any.bbcode
#        ^^^^                         meta.tag.any.bbcode
#  ^^^^^^                             markup.italic
[b][i]bolditalic[/i][/b]              # nested emphasis
# <-                                  meta.tag.any.bbcode
#^^^^^                                meta.tag.any.bbcode
#               ^^^^^^^^              meta.tag.any.bbcode
#     ^^^^^^^^^^                      markup.bold markup.italic
[i][b]italicbold[/b][/i]              # nested emphasis
# <-                                  meta.tag.any.bbcode
#^^^^                                 meta.tag.any.bbcode
#               ^^^^^^^^              meta.tag.any.bbcode
#     ^^^^^^^^^^                      markup.italic markup.bold
[b]bold[i]bolditalic[/i]bold[/b]      # nested emphasis
# <-                                  meta.tag.any.bbcode
#^^                                   meta.tag.any.bbcode
#      ^^^                            meta.tag.any.bbcode
#                   ^^^^              meta.tag.any.bbcode
#                           ^^^^      meta.tag.any.bbcode
#  ^^^^                               markup.bold
#                       ^^^^          markup.bold
#         ^^^^^^^^^^                  markup.bold markup.italic
[i]italic[b]italicbold[/b]italic[/i]  # nested emphasis
# <-                                  meta.tag.any.bbcode
#^^                                   meta.tag.any.bbcode
#        ^^^                          meta.tag.any.bbcode
#                     ^^^^            meta.tag.any.bbcode
#                               ^^^^  meta.tag.any.bbcode
#  ^^^^^^                             markup.italic
#                         ^^^^^^      markup.italic
#           ^^^^^^^^^^                markup.italic markup.bold
[i]i[b]ib[u]ibu[s]ibus[/s]ibu[/u]ib[/b]i[/i] # nested emphasis
# <-                                         meta.tag.any.bbcode
#^^                                          meta.tag.any.bbcode
#   ^^^                                      meta.tag.any.bbcode
#        ^^^                                 meta.tag.any.bbcode
#              ^^^                           meta.tag.any.bbcode
#                     ^^^^                   meta.tag.any.bbcode
#                            ^^^^            meta.tag.any.bbcode
#                                  ^^^^      meta.tag.any.bbcode
#                                       ^^^^ meta.tag.any.bbcode
#  ^                                         markup.italic
#                                      ^     markup.italic
#      ^^                                    markup.italic markup.bold
#                                ^^          markup.italic markup.bold
#           ^^^                              markup.italic markup.bold markup.underline
#                         ^^^                markup.italic markup.bold markup.underline
#                 ^^^^                       markup.italic markup.bold markup.underline markup.strikethrough


# 3 Test other tags
[color="red"] # Color tag
# <-          meta.tag.any.bbcode
#^^^^^^       meta.tag.any.bbcode
#           ^ meta.tag.any.bbcode
#      ^^^^^  meta.tag.value.bbcode
red text      #
# <-          text.bbcode
#^^^^^^^      text.bbcode
[/color]      #
# <-          meta.tag.any.bbcode
#^^^^^^^      meta.tag.any.bbcode


# 4 Test embedded languages
[code=python]
# <-                   meta.tag.code.python.bbcode
#^^^^^^^^^^^^          meta.tag.code.python.bbcode
#            ^         source.python.embedded.bbcode source.python
import sys
#^^^^^^^^^             source.python.embedded.bbcode source.python
#^^^^^                 keyword.control.import.python
sys.path.append('./')
#^^^^^^^^^^^^^^^^^^^^  source.python.embedded.bbcode source.python
#        ^^^^^^        variable.function.python
def func(language):
#^^^^^^^^^^^^^^^^^^    source.python.embedded.bbcode source.python
#   ^^^^               entity.name.function.python
  t = 1
# ^^^^^                source.python.embedded.bbcode source.python
#   ^                  keyword.operator.assignment.python
[/code]
# <-                   meta.tag.code.python.bbcode
#^^^^^^                meta.tag.code.python.bbcode
