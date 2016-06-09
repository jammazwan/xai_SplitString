There are so many approaches to splitting a message body that I found it helpful to break it into different projects.

### Common to all x__Split___ Projects

There are often many different ways to split even just one kind of body. This is where Camel's "does everything to anything" approach can be a bit confusing to the newbie. You may eventually want to learn 20 great approaches, but right now you just want one specific approach that's going work for your use case.

So each Split___ example project has to show, and/or cross reference, working code that makes each of the relevant approaches work, quickly and without a bunch of cruft.

**All Split___ example projects** were inspired by a grep of **'.split('** on **'*Test.java'** in the actual **camel-core** code base - hundreds of examples. A good place to start, if you want a more in depth exploration of anything, not just '.split('.

You will probably want to read [**this doc on Camel's site**](http://camel.apache.org/splitter.html) before doing much with splits. It took me a week to find it, and ended up being one of the best sources.

### SplitString NOTES:

[Tokenize](https://camel.apache.org/maven/camel-2.15.0/camel-core/apidocs/org/apache/camel/language/tokenizer/TokenizeLanguage.html) is the primary tool for String splitting, so this x__project is restricted to that API.

Three sets of examples will be shown. You can also find many more in a test class called **SplitTokenizerTest** in camel-core.

### Frequent Flier - split file into lines:

This is duplicated from [**xaj_SplitFile**](https://github.com/jammazwan/xaj_SplitFile) and is probably the most common use case for tokenize.

### Delimiter

To be unique, I show a space delimiter as a regex. Most cases you'd use something like a comma or tab. 

### Pair

```
[ and ]
```

### Alternatives Not Shown

If you examine camel-core you may find many examples where String's own split(delimiter) API was used. I am guessing that this preceeded the development of advanced tokenizer features?

This usage is not shown here.