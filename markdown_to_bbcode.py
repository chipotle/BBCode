# coding: utf-8
import sublime_plugin
import re


class MarkdownToBbcodeCommand(sublime_plugin.TextCommand):
    def run(self, edit):
        self.convert_links(edit)
        self.convert_separators(edit)
        self.convert_bold(edit)
        self.convert_italics(edit)

    def translate(self, edit, from_re, to_func):
        re_text = re.compile(from_re)
        v = self.view.find(from_re, 0)
        while v is not None:
            res = re_text.match(self.view.substr(v))
            if not res:
                continue
            text = to_func(res)
            self.view.replace(edit, v, text)
            v = self.view.find(from_re, v.end())

    def convert_separators(self, edit):
        rep = lambda x: '[center]* * *[/center]'
        self.translate(edit, '^-{3,}$', rep)
        self.translate(edit, '^\* \* \*$', rep)

    def convert_links(self, edit):
        rep = lambda x: '[url=' + x.group(2) + ']' + x.group(1) + '[/url]'
        self.translate(edit, '\[([^\]]*?)\]\((.*?)\)', rep)

    def convert_bold(self, edit):
        rep = lambda x: '[b]' + x.group(2) + '[/b]'
        self.translate(edit, '(__|\*\*)(\S.*?)(__|\*\*)', rep)

    def convert_italics(self, edit):
        rep = lambda x: '[i]' + x.group(2) + '[/i]'
        self.translate(edit, '(_|\*)(\S.*?)(_|\*)', rep)
