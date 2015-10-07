{:namespaces
 ({:source-url
   "https://github.com/clojure/tools.namespace/blob/163bee73ce1d78995bf355e5bebb0abb9964f6d5/src/main/clojure/clojure/tools/namespace.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace/clojure.tools.namespace-api.html",
   :name "clojure.tools.namespace",
   :author "Stuart Sierra",
   :doc
   "This namespace is DEPRECATED; most functions have been moved to\nother namespaces"}
  {:source-url nil,
   :wiki-url
   "http://clojure.github.com/tools.namespace/clojure.tools.namespace.dependency-api.html",
   :name "clojure.tools.namespace.dependency",
   :author "Stuart Sierra",
   :doc "Bidirectional graphs of dependencies and dependent objects."}
  {:source-url
   "https://github.com/clojure/tools.namespace/blob/64e807c1888b494d04bb4dc96432d4d76aa0db54/src/main/clojure/clojure/tools/namespace/dir.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace/clojure.tools.namespace.dir-api.html",
   :name "clojure.tools.namespace.dir",
   :author "Stuart Sierra",
   :doc
   "Track namespace dependencies and changes by monitoring\nfile-modification timestamps"}
  {:source-url
   "https://github.com/clojure/tools.namespace/blob/b3ab6df0dcec347c1e53de36a99c274b35479267/src/main/clojure/clojure/tools/namespace/file.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace/clojure.tools.namespace.file-api.html",
   :name "clojure.tools.namespace.file",
   :author "Stuart Sierra",
   :doc "Read and track namespace information from files"}
  {:source-url
   "https://github.com/clojure/tools.namespace/blob/b3ab6df0dcec347c1e53de36a99c274b35479267/src/main/clojure/clojure/tools/namespace/find.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace/clojure.tools.namespace.find-api.html",
   :name "clojure.tools.namespace.find",
   :author "Stuart Sierra",
   :doc
   "Search for namespace declarations in directories and JAR files."}
  {:source-url
   "https://github.com/clojure/tools.namespace/blob/09e1e1fd81faed4e24399bf68bf78e87b32eb68b/src/main/clojure/clojure/tools/namespace/move.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace/clojure.tools.namespace.move-api.html",
   :name "clojure.tools.namespace.move",
   :author "Stuart Sierra",
   :doc
   "Refactoring tool to move a Clojure namespace from one name/file to\nanother, and update all references to that namespace in your other\nClojure source files.\n\nWARNING: This code is ALPHA and subject to change. It also modifies\nand deletes your source files! Make sure you have a backup or\nversion control."}
  {:source-url nil,
   :wiki-url
   "http://clojure.github.com/tools.namespace/clojure.tools.namespace.parse-api.html",
   :name "clojure.tools.namespace.parse",
   :author "Stuart Sierra",
   :doc
   "Parse Clojure namespace (ns) declarations and extract\ndependencies."}
  {:source-url
   "https://github.com/clojure/tools.namespace/blob/27194f2edfe3f5f9e1343f993beca4b43f0bafe8/src/main/clojure/clojure/tools/namespace/reload.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace/clojure.tools.namespace.reload-api.html",
   :name "clojure.tools.namespace.reload",
   :author "Stuart Sierra",
   :doc
   "Force reloading namespaces on demand or through a\ndependency tracker"}
  {:source-url
   "https://github.com/clojure/tools.namespace/blob/0ce6646bb59a319a864faad5d01f1bc31c79e932/src/main/clojure/clojure/tools/namespace/repl.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace/clojure.tools.namespace.repl-api.html",
   :name "clojure.tools.namespace.repl",
   :author "Stuart Sierra",
   :doc "REPL utilities for working with namespaces"}
  {:source-url nil,
   :wiki-url
   "http://clojure.github.com/tools.namespace/clojure.tools.namespace.track-api.html",
   :name "clojure.tools.namespace.track",
   :author "Stuart Sierra",
   :doc
   "Dependency tracker which can compute which namespaces need to be\nreloaded after files have changed. This is the low-level\nimplementation that requires you to find the namespace dependencies\nyourself: most uses will interact with the wrappers in\nclojure.tools.namespace.file and clojure.tools.namespace.dir or the\npublic API in clojure.tools.namespace.repl."}),
 :vars
 ({:arglists ([file]),
   :name "clojure-source-file?",
   :namespace "clojure.tools.namespace",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/163bee73ce1d78995bf355e5bebb0abb9964f6d5/src/main/clojure/clojure/tools/namespace.clj#L24",
   :deprecated "0.2.1",
   :added "0.1.0",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/163bee73ce1d78995bf355e5bebb0abb9964f6d5/src/main/clojure/clojure/tools/namespace.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace/clojure-source-file?",
   :doc
   "DEPRECATED; moved to clojure.tools.namespace.file\n\nReturns true if file is a normal file with a .clj or .cljc extension.",
   :var-type "function",
   :line 24,
   :file "src/main/clojure/clojure/tools/namespace.clj"}
  {:arglists ([jar-file]),
   :name "clojure-sources-in-jar",
   :namespace "clojure.tools.namespace",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/163bee73ce1d78995bf355e5bebb0abb9964f6d5/src/main/clojure/clojure/tools/namespace.clj#L154",
   :deprecated "0.2.1",
   :added "0.1.0",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/163bee73ce1d78995bf355e5bebb0abb9964f6d5/src/main/clojure/clojure/tools/namespace.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace/clojure-sources-in-jar",
   :doc
   "DEPRECATED; moved to clojure.tools.namespace.find\n\nReturns a sequence of filenames ending in .clj or .cljc found in the JAR file.",
   :var-type "function",
   :line 154,
   :file "src/main/clojure/clojure/tools/namespace.clj"}
  {:arglists ([form]),
   :name "comment?",
   :namespace "clojure.tools.namespace",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/163bee73ce1d78995bf355e5bebb0abb9964f6d5/src/main/clojure/clojure/tools/namespace.clj#L48",
   :deprecated "0.2.1",
   :added "0.1.0",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/163bee73ce1d78995bf355e5bebb0abb9964f6d5/src/main/clojure/clojure/tools/namespace.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace/comment?",
   :doc
   "DEPRECATED; moved to clojure.tools.namespace.parse\n\nReturns true if form is a (comment ...)",
   :var-type "function",
   :line 48,
   :file "src/main/clojure/clojure/tools/namespace.clj"}
  {:arglists ([dir]),
   :name "find-clojure-sources-in-dir",
   :namespace "clojure.tools.namespace",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/163bee73ce1d78995bf355e5bebb0abb9964f6d5/src/main/clojure/clojure/tools/namespace.clj#L36",
   :deprecated "0.2.1",
   :added "0.1.0",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/163bee73ce1d78995bf355e5bebb0abb9964f6d5/src/main/clojure/clojure/tools/namespace.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace/find-clojure-sources-in-dir",
   :doc
   "DEPRECATED; moved to clojure.tools.namespace.find\n\nSearches recursively under dir for Clojure source files (.clj, .cljc).\nReturns a sequence of File objects, in breadth-first sort order.",
   :var-type "function",
   :line 36,
   :file "src/main/clojure/clojure/tools/namespace.clj"}
  {:arglists ([dir]),
   :name "find-namespaces-in-dir",
   :namespace "clojure.tools.namespace",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/163bee73ce1d78995bf355e5bebb0abb9964f6d5/src/main/clojure/clojure/tools/namespace.clj#L106",
   :deprecated "0.2.1",
   :added "0.1.0",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/163bee73ce1d78995bf355e5bebb0abb9964f6d5/src/main/clojure/clojure/tools/namespace.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace/find-namespaces-in-dir",
   :doc
   "DEPRECATED; moved to clojure.tools.namespace.find\n\nSearches dir recursively for (ns ...) declarations in Clojure\nsource files; returns the symbol names of the declared namespaces.",
   :var-type "function",
   :line 106,
   :file "src/main/clojure/clojure/tools/namespace.clj"}
  {:arglists ([jarfile]),
   :name "find-namespaces-in-jarfile",
   :namespace "clojure.tools.namespace",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/163bee73ce1d78995bf355e5bebb0abb9964f6d5/src/main/clojure/clojure/tools/namespace.clj#L191",
   :deprecated "0.2.1",
   :added "0.1.0",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/163bee73ce1d78995bf355e5bebb0abb9964f6d5/src/main/clojure/clojure/tools/namespace.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace/find-namespaces-in-jarfile",
   :doc
   "DEPRECATED; moved to clojure.tools.namespace.find\n\nSearches the JAR file for Clojure source files containing (ns ...)\ndeclarations.  Returns a sequence of the symbol names of the\ndeclared namespaces.",
   :var-type "function",
   :line 191,
   :file "src/main/clojure/clojure/tools/namespace.clj"}
  {:arglists ([]),
   :name "find-namespaces-on-classpath",
   :namespace "clojure.tools.namespace",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/163bee73ce1d78995bf355e5bebb0abb9964f6d5/src/main/clojure/clojure/tools/namespace.clj#L219",
   :deprecated "0.2.1",
   :added "0.1.0",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/163bee73ce1d78995bf355e5bebb0abb9964f6d5/src/main/clojure/clojure/tools/namespace.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace/find-namespaces-on-classpath",
   :doc
   "DEPRECATED; use clojure.tools.namespace.find/find-namespaces\nand clojure.java.classpath/classpath from\nhttp://github.com/clojure/java.classpath\n\nSearches CLASSPATH (both directories and JAR files) for Clojure\nsource files containing (ns ...) declarations.  Returns a sequence\nof the symbol names of the declared namespaces.",
   :var-type "function",
   :line 219,
   :file "src/main/clojure/clojure/tools/namespace.clj"}
  {:arglists ([dir]),
   :name "find-ns-decls-in-dir",
   :namespace "clojure.tools.namespace",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/163bee73ce1d78995bf355e5bebb0abb9964f6d5/src/main/clojure/clojure/tools/namespace.clj#L96",
   :deprecated "0.2.1",
   :added "0.1.0",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/163bee73ce1d78995bf355e5bebb0abb9964f6d5/src/main/clojure/clojure/tools/namespace.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace/find-ns-decls-in-dir",
   :doc
   "DEPRECATED; moved to clojure.tools.namespace.find\n\nSearches dir recursively for (ns ...) declarations in Clojure\nsource files; returns the unevaluated ns declarations.",
   :var-type "function",
   :line 96,
   :file "src/main/clojure/clojure/tools/namespace.clj"}
  {:arglists ([jarfile]),
   :name "find-ns-decls-in-jarfile",
   :namespace "clojure.tools.namespace",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/163bee73ce1d78995bf355e5bebb0abb9964f6d5/src/main/clojure/clojure/tools/namespace.clj#L179",
   :deprecated "0.2.1",
   :added "0.1.0",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/163bee73ce1d78995bf355e5bebb0abb9964f6d5/src/main/clojure/clojure/tools/namespace.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace/find-ns-decls-in-jarfile",
   :doc
   "DEPRECATED; moved to clojure.tools.namespace.find\n\nSearches the JAR file for Clojure source files containing (ns ...)\ndeclarations; returns the unevaluated ns declarations.",
   :var-type "function",
   :line 179,
   :file "src/main/clojure/clojure/tools/namespace.clj"}
  {:arglists ([]),
   :name "find-ns-decls-on-classpath",
   :namespace "clojure.tools.namespace",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/163bee73ce1d78995bf355e5bebb0abb9964f6d5/src/main/clojure/clojure/tools/namespace.clj#L204",
   :deprecated "0.2.1",
   :added "0.1.0",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/163bee73ce1d78995bf355e5bebb0abb9964f6d5/src/main/clojure/clojure/tools/namespace.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace/find-ns-decls-on-classpath",
   :doc
   "DEPRECATED; use clojure.tools.namespace.find/find-ns-decls\nand clojure.java.classpath/classpath from\nhttp://github.com/clojure/java.classpath\n\nSearches CLASSPATH (both directories and JAR files) for Clojure\nsource files containing (ns ...) declarations. Returns a sequence of\nthe unevaluated ns declaration forms.",
   :var-type "function",
   :line 204,
   :file "src/main/clojure/clojure/tools/namespace.clj"}
  {:arglists ([form]),
   :name "ns-decl?",
   :namespace "clojure.tools.namespace",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/163bee73ce1d78995bf355e5bebb0abb9964f6d5/src/main/clojure/clojure/tools/namespace.clj#L57",
   :deprecated "0.2.1",
   :added "0.1.0",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/163bee73ce1d78995bf355e5bebb0abb9964f6d5/src/main/clojure/clojure/tools/namespace.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace/ns-decl?",
   :doc
   "DEPRECATED; moved to clojure.tools.namespace.parse\n\nReturns true if form is a (ns ...) declaration.",
   :var-type "function",
   :line 57,
   :file "src/main/clojure/clojure/tools/namespace.clj"}
  {:arglists ([file]),
   :name "read-file-ns-decl",
   :namespace "clojure.tools.namespace",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/163bee73ce1d78995bf355e5bebb0abb9964f6d5/src/main/clojure/clojure/tools/namespace.clj#L84",
   :deprecated "0.2.1",
   :added "0.1.0",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/163bee73ce1d78995bf355e5bebb0abb9964f6d5/src/main/clojure/clojure/tools/namespace.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace/read-file-ns-decl",
   :doc
   "DEPRECATED; moved to clojure.tools.namespace.file\n\nAttempts to read a (ns ...) declaration from file, and returns the\nunevaluated form.  Returns nil if read fails, or if the first form\nis not a ns declaration.",
   :var-type "function",
   :line 84,
   :file "src/main/clojure/clojure/tools/namespace.clj"}
  {:arglists ([rdr]),
   :name "read-ns-decl",
   :namespace "clojure.tools.namespace",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/163bee73ce1d78995bf355e5bebb0abb9964f6d5/src/main/clojure/clojure/tools/namespace.clj#L66",
   :deprecated "0.2.1",
   :added "0.1.0",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/163bee73ce1d78995bf355e5bebb0abb9964f6d5/src/main/clojure/clojure/tools/namespace.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace/read-ns-decl",
   :doc
   "DEPRECATED; moved to clojure.tools.namespace.parse\n\nAttempts to read a (ns ...) declaration from rdr, and returns the\nunevaluated form.  Returns nil if read fails or if a ns declaration\ncannot be found.  The ns declaration must be the first Clojure form\nin the file, except for (comment ...)  forms.",
   :var-type "function",
   :line 66,
   :file "src/main/clojure/clojure/tools/namespace.clj"}
  {:arglists ([jarfile entry-name]),
   :name "read-ns-decl-from-jarfile-entry",
   :namespace "clojure.tools.namespace",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/163bee73ce1d78995bf355e5bebb0abb9964f6d5/src/main/clojure/clojure/tools/namespace.clj#L164",
   :deprecated "0.2.1",
   :added "0.1.0",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/163bee73ce1d78995bf355e5bebb0abb9964f6d5/src/main/clojure/clojure/tools/namespace.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace/read-ns-decl-from-jarfile-entry",
   :doc
   "DEPRECATED; moved to clojure.tools.namespace.find\n\nAttempts to read a (ns ...) declaration from the named entry in the\nJAR file, and returns the unevaluated form.  Returns nil if the read\nfails, or if the first form is not a ns declaration.",
   :var-type "function",
   :line 164,
   :file "src/main/clojure/clojure/tools/namespace.clj"}
  {:arglists ([dependencies dependents]),
   :name "->MapDependencyGraph",
   :namespace "clojure.tools.namespace.dependency",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/1b3228552547b5227130c5c585558d2b76c35a71/src/main/clojure/clojure/tools/namespace/dependency.cljc#L69",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/1b3228552547b5227130c5c585558d2b76c35a71/src/main/clojure/clojure/tools/namespace/dependency.cljc",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.dependency/->MapDependencyGraph",
   :doc
   "Positional factory function for class clojure.tools.namespace.dependency.MapDependencyGraph.",
   :var-type "function",
   :line 69,
   :file "src/main/clojure/clojure/tools/namespace/dependency.cljc"}
  {:arglists ([graph x y]),
   :name "dependent?",
   :namespace "clojure.tools.namespace.dependency",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/1b3228552547b5227130c5c585558d2b76c35a71/src/main/clojure/clojure/tools/namespace/dependency.cljc#L118",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/1b3228552547b5227130c5c585558d2b76c35a71/src/main/clojure/clojure/tools/namespace/dependency.cljc",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.dependency/dependent?",
   :doc "True if y is a dependent of x.",
   :var-type "function",
   :line 118,
   :file "src/main/clojure/clojure/tools/namespace/dependency.cljc"}
  {:arglists ([graph x y]),
   :name "depends?",
   :namespace "clojure.tools.namespace.dependency",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/1b3228552547b5227130c5c585558d2b76c35a71/src/main/clojure/clojure/tools/namespace/dependency.cljc#L113",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/1b3228552547b5227130c5c585558d2b76c35a71/src/main/clojure/clojure/tools/namespace/dependency.cljc",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.dependency/depends?",
   :doc "True if x is directly or transitively dependent on y.",
   :var-type "function",
   :line 113,
   :file "src/main/clojure/clojure/tools/namespace/dependency.cljc"}
  {:arglists ([]),
   :name "graph",
   :namespace "clojure.tools.namespace.dependency",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/1b3228552547b5227130c5c585558d2b76c35a71/src/main/clojure/clojure/tools/namespace/dependency.cljc#L110",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/1b3228552547b5227130c5c585558d2b76c35a71/src/main/clojure/clojure/tools/namespace/dependency.cljc",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.dependency/graph",
   :doc "Returns a new, empty, dependency graph.",
   :var-type "function",
   :line 110,
   :file "src/main/clojure/clojure/tools/namespace/dependency.cljc"}
  {:arglists ([m__6289__auto__]),
   :name "map->MapDependencyGraph",
   :namespace "clojure.tools.namespace.dependency",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/1b3228552547b5227130c5c585558d2b76c35a71/src/main/clojure/clojure/tools/namespace/dependency.cljc#L69",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/1b3228552547b5227130c5c585558d2b76c35a71/src/main/clojure/clojure/tools/namespace/dependency.cljc",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.dependency/map->MapDependencyGraph",
   :doc
   "Factory function for class clojure.tools.namespace.dependency.MapDependencyGraph, taking a map of keywords to field values.",
   :var-type "function",
   :line 69,
   :file "src/main/clojure/clojure/tools/namespace/dependency.cljc"}
  {:arglists ([graph]),
   :name "topo-comparator",
   :namespace "clojure.tools.namespace.dependency",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/1b3228552547b5227130c5c585558d2b76c35a71/src/main/clojure/clojure/tools/namespace/dependency.cljc#L152",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/1b3228552547b5227130c5c585558d2b76c35a71/src/main/clojure/clojure/tools/namespace/dependency.cljc",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.dependency/topo-comparator",
   :doc
   "Returns a comparator fn which produces a topological sort based on\nthe dependencies in graph. Nodes not present in the graph will sort\nafter nodes in the graph.",
   :var-type "function",
   :line 152,
   :file "src/main/clojure/clojure/tools/namespace/dependency.cljc"}
  {:arglists ([graph]),
   :name "topo-sort",
   :namespace "clojure.tools.namespace.dependency",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/1b3228552547b5227130c5c585558d2b76c35a71/src/main/clojure/clojure/tools/namespace/dependency.cljc#L123",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/1b3228552547b5227130c5c585558d2b76c35a71/src/main/clojure/clojure/tools/namespace/dependency.cljc",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.dependency/topo-sort",
   :doc "Returns a topologically-sorted list of nodes in graph.",
   :var-type "function",
   :line 123,
   :file "src/main/clojure/clojure/tools/namespace/dependency.cljc"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.dependency/MapDependencyGraph",
   :namespace "clojure.tools.namespace.dependency",
   :var-type "record",
   :name "MapDependencyGraph"}
  {:file "src/main/clojure/clojure/tools/namespace/dependency.cljc",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/1b3228552547b5227130c5c585558d2b76c35a71/src/main/clojure/clojure/tools/namespace/dependency.cljc",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/1b3228552547b5227130c5c585558d2b76c35a71/src/main/clojure/clojure/tools/namespace/dependency.cljc#L14",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.dependency/DependencyGraph",
   :namespace "clojure.tools.namespace.dependency",
   :line 14,
   :var-type "protocol",
   :doc nil,
   :name "DependencyGraph"}
  {:file "src/main/clojure/clojure/tools/namespace/dependency.cljc",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/1b3228552547b5227130c5c585558d2b76c35a71/src/main/clojure/clojure/tools/namespace/dependency.cljc",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/1b3228552547b5227130c5c585558d2b76c35a71/src/main/clojure/clojure/tools/namespace/dependency.cljc#L34",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.dependency/DependencyGraphUpdate",
   :namespace "clojure.tools.namespace.dependency",
   :line 34,
   :var-type "protocol",
   :doc nil,
   :name "DependencyGraphUpdate"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.dependency/immediate-dependencies",
   :namespace "clojure.tools.namespace.dependency",
   :var-type "function",
   :arglists ([graph node]),
   :doc "Returns the set of immediate dependencies of node.",
   :name "immediate-dependencies"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.dependency/immediate-dependents",
   :namespace "clojure.tools.namespace.dependency",
   :var-type "function",
   :arglists ([graph node]),
   :doc "Returns the set of immediate dependents of node.",
   :name "immediate-dependents"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.dependency/nodes",
   :namespace "clojure.tools.namespace.dependency",
   :var-type "function",
   :arglists ([graph]),
   :doc "Returns the set of all nodes in graph.",
   :name "nodes"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.dependency/transitive-dependencies",
   :namespace "clojure.tools.namespace.dependency",
   :var-type "function",
   :arglists ([graph node]),
   :doc
   "Returns the set of all things which node depends on, directly or\ntransitively.",
   :name "transitive-dependencies"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.dependency/transitive-dependencies-set",
   :namespace "clojure.tools.namespace.dependency",
   :var-type "function",
   :arglists ([graph node-set]),
   :doc
   "Returns the set of all things which any node in node-set depends\non, directly or transitively.",
   :name "transitive-dependencies-set"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.dependency/transitive-dependents",
   :namespace "clojure.tools.namespace.dependency",
   :var-type "function",
   :arglists ([graph node]),
   :doc
   "Returns the set of all things which depend upon node, directly or\ntransitively.",
   :name "transitive-dependents"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.dependency/transitive-dependents-set",
   :namespace "clojure.tools.namespace.dependency",
   :var-type "function",
   :arglists ([graph node-set]),
   :doc
   "Returns the set of all things which depend upon any node in\nnode-set, directly or transitively.",
   :name "transitive-dependents-set"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.dependency/depend",
   :namespace "clojure.tools.namespace.dependency",
   :var-type "function",
   :arglists ([graph node dep]),
   :doc
   "Returns a new graph with a dependency from node to dep (\"node depends\non dep\"). Forbids circular dependencies.",
   :name "depend"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.dependency/remove-all",
   :namespace "clojure.tools.namespace.dependency",
   :var-type "function",
   :arglists ([graph node]),
   :doc
   "Returns a new dependency graph with all references to node removed.",
   :name "remove-all"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.dependency/remove-edge",
   :namespace "clojure.tools.namespace.dependency",
   :var-type "function",
   :arglists ([graph node dep]),
   :doc
   "Returns a new graph with the dependency from node to dep removed.",
   :name "remove-edge"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.dependency/remove-node",
   :namespace "clojure.tools.namespace.dependency",
   :var-type "function",
   :arglists ([graph node]),
   :doc
   "Removes the node from the dependency graph without removing it as a\ndependency of other nodes. That is, removes all outgoing edges from\nnode.",
   :name "remove-node"}
  {:arglists ([tracker & dirs]),
   :name "scan",
   :namespace "clojure.tools.namespace.dir",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/64e807c1888b494d04bb4dc96432d4d76aa0db54/src/main/clojure/clojure/tools/namespace/dir.clj#L92",
   :deprecated "0.3.0",
   :added "0.2.0",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/64e807c1888b494d04bb4dc96432d4d76aa0db54/src/main/clojure/clojure/tools/namespace/dir.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.dir/scan",
   :doc
   "DEPRECATED: replaced by scan-dirs.\n\nScans directories for Clojure (.clj, .cljc) source files which have\nchanged since the last time 'scan' was run; update the dependency\ntracker with new/changed/deleted files.\n\nIf no dirs given, defaults to all directories on the classpath.",
   :var-type "function",
   :line 92,
   :file "src/main/clojure/clojure/tools/namespace/dir.clj"}
  {:arglists ([tracker & dirs]),
   :name "scan-all",
   :namespace "clojure.tools.namespace.dir",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/64e807c1888b494d04bb4dc96432d4d76aa0db54/src/main/clojure/clojure/tools/namespace/dir.clj#L105",
   :deprecated "0.3.0",
   :added "0.2.0",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/64e807c1888b494d04bb4dc96432d4d76aa0db54/src/main/clojure/clojure/tools/namespace/dir.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.dir/scan-all",
   :doc
   "DEPRECATED: replaced by scan-dirs.\n\nScans directories for all Clojure source files and updates the\ndependency tracker to reload files. If no dirs given, defaults to\nall directories on the classpath.",
   :var-type "function",
   :line 105,
   :file "src/main/clojure/clojure/tools/namespace/dir.clj"}
  {:arglists
   ([tracker]
    [tracker dirs]
    [tracker dirs {:keys [platform add-all?], :as options}]),
   :name "scan-dirs",
   :namespace "clojure.tools.namespace.dir",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/64e807c1888b494d04bb4dc96432d4d76aa0db54/src/main/clojure/clojure/tools/namespace/dir.clj#L69",
   :added "0.3.0",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/64e807c1888b494d04bb4dc96432d4d76aa0db54/src/main/clojure/clojure/tools/namespace/dir.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.dir/scan-dirs",
   :doc
   "Scans directories for files which have changed since the last time\n'scan-dirs' or 'scan-files' was run; updates the dependency tracker\nwith new/changed/deleted files.\n\ndirs is the collection of directories to scan, defaults to all\ndirectories on Clojure's classpath.\n\nOptional third argument is map of options:\n\n  :platform  Either clj (default) or cljs, both defined in \n             clojure.tools.namespace.find, controls file extensions \n             and reader options.\n\n  :add-all?  If true, assumes all extant files are modified regardless\n             of filesystem timestamps.",
   :var-type "function",
   :line 69,
   :file "src/main/clojure/clojure/tools/namespace/dir.clj"}
  {:arglists
   ([tracker files] [tracker files {:keys [platform add-all?]}]),
   :name "scan-files",
   :namespace "clojure.tools.namespace.dir",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/64e807c1888b494d04bb4dc96432d4d76aa0db54/src/main/clojure/clojure/tools/namespace/dir.clj#L43",
   :added "0.3.0",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/64e807c1888b494d04bb4dc96432d4d76aa0db54/src/main/clojure/clojure/tools/namespace/dir.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.dir/scan-files",
   :doc
   "Scans files to find those which have changed since the last time\n'scan-files' was run; updates the dependency tracker with\nnew/changed/deleted files.\n\nfiles is the collection of files to scan.\n\nOptional third argument is map of options:\n\n  :platform  Either clj (default) or cljs, both defined in\n             clojure.tools.namespace.find, controls reader options for \n             parsing files.\n\n  :add-all?  If true, assumes all extant files are modified regardless\n             of filesystem timestamps.",
   :var-type "function",
   :line 43,
   :file "src/main/clojure/clojure/tools/namespace/dir.clj"}
  {:arglists ([tracker files] [tracker files read-opts]),
   :name "add-files",
   :namespace "clojure.tools.namespace.file",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/b3ab6df0dcec347c1e53de36a99c274b35479267/src/main/clojure/clojure/tools/namespace/file.clj#L76",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/b3ab6df0dcec347c1e53de36a99c274b35479267/src/main/clojure/clojure/tools/namespace/file.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.file/add-files",
   :doc
   "Reads ns declarations from files; returns an updated dependency\ntracker with those files added. read-opts is passed through to\ntools.reader.",
   :var-type "function",
   :line 76,
   :file "src/main/clojure/clojure/tools/namespace/file.clj"}
  {:name "clojure-extensions",
   :namespace "clojure.tools.namespace.file",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/b3ab6df0dcec347c1e53de36a99c274b35479267/src/main/clojure/clojure/tools/namespace/file.clj#L38",
   :added "0.3.0",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/b3ab6df0dcec347c1e53de36a99c274b35479267/src/main/clojure/clojure/tools/namespace/file.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.file/clojure-extensions",
   :doc "File extensions for Clojure (JVM) files.",
   :var-type "var",
   :line 38,
   :file "src/main/clojure/clojure/tools/namespace/file.clj"}
  {:arglists ([file]),
   :name "clojure-file?",
   :namespace "clojure.tools.namespace.file",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/b3ab6df0dcec347c1e53de36a99c274b35479267/src/main/clojure/clojure/tools/namespace/file.clj#L48",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/b3ab6df0dcec347c1e53de36a99c274b35479267/src/main/clojure/clojure/tools/namespace/file.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.file/clojure-file?",
   :doc
   "Returns true if the java.io.File represents a file which will be\nread by the Clojure (JVM) compiler.",
   :var-type "function",
   :line 48,
   :file "src/main/clojure/clojure/tools/namespace/file.clj"}
  {:name "clojurescript-extensions",
   :namespace "clojure.tools.namespace.file",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/b3ab6df0dcec347c1e53de36a99c274b35479267/src/main/clojure/clojure/tools/namespace/file.clj#L43",
   :added "0.3.0",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/b3ab6df0dcec347c1e53de36a99c274b35479267/src/main/clojure/clojure/tools/namespace/file.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.file/clojurescript-extensions",
   :doc "File extensions for ClojureScript files.",
   :var-type "var",
   :line 43,
   :file "src/main/clojure/clojure/tools/namespace/file.clj"}
  {:arglists ([file]),
   :name "clojurescript-file?",
   :namespace "clojure.tools.namespace.file",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/b3ab6df0dcec347c1e53de36a99c274b35479267/src/main/clojure/clojure/tools/namespace/file.clj#L54",
   :added "0.3.0",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/b3ab6df0dcec347c1e53de36a99c274b35479267/src/main/clojure/clojure/tools/namespace/file.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.file/clojurescript-file?",
   :doc
   "Returns true if the java.io.File represents a file which will be\nread by the ClojureScript compiler.",
   :var-type "function",
   :line 54,
   :file "src/main/clojure/clojure/tools/namespace/file.clj"}
  {:arglists ([file extensions]),
   :name "file-with-extension?",
   :namespace "clojure.tools.namespace.file",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/b3ab6df0dcec347c1e53de36a99c274b35479267/src/main/clojure/clojure/tools/namespace/file.clj#L29",
   :added "0.3.0",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/b3ab6df0dcec347c1e53de36a99c274b35479267/src/main/clojure/clojure/tools/namespace/file.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.file/file-with-extension?",
   :doc
   "Returns true if the java.io.File represents a file whose name ends\nwith one of the Strings in extensions.",
   :var-type "function",
   :line 29,
   :file "src/main/clojure/clojure/tools/namespace/file.clj"}
  {:arglists ([file] [file read-opts]),
   :name "read-file-ns-decl",
   :namespace "clojure.tools.namespace.file",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/b3ab6df0dcec347c1e53de36a99c274b35479267/src/main/clojure/clojure/tools/namespace/file.clj#L17",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/b3ab6df0dcec347c1e53de36a99c274b35479267/src/main/clojure/clojure/tools/namespace/file.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.file/read-file-ns-decl",
   :doc
   "Attempts to read a (ns ...) declaration from file, and returns the\nunevaluated form. Returns nil if read fails due to invalid syntax or\nif a ns declaration cannot be found. read-opts is passed through to\ntools.reader/read.",
   :var-type "function",
   :line 17,
   :file "src/main/clojure/clojure/tools/namespace/file.clj"}
  {:arglists ([tracker files]),
   :name "remove-files",
   :namespace "clojure.tools.namespace.file",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/b3ab6df0dcec347c1e53de36a99c274b35479267/src/main/clojure/clojure/tools/namespace/file.clj#L88",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/b3ab6df0dcec347c1e53de36a99c274b35479267/src/main/clojure/clojure/tools/namespace/file.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.file/remove-files",
   :doc
   "Returns an updated dependency tracker with files removed. The files\nmust have been previously added with add-files.",
   :var-type "function",
   :line 88,
   :file "src/main/clojure/clojure/tools/namespace/file.clj"}
  {:name "clj",
   :namespace "clojure.tools.namespace.find",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/b3ab6df0dcec347c1e53de36a99c274b35479267/src/main/clojure/clojure/tools/namespace/find.clj#L22",
   :added "0.3.0",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/b3ab6df0dcec347c1e53de36a99c274b35479267/src/main/clojure/clojure/tools/namespace/find.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.find/clj",
   :doc
   "Platform definition of file extensions and reader options for\nClojure (.clj and .cljc) source files.",
   :var-type "var",
   :line 22,
   :file "src/main/clojure/clojure/tools/namespace/find.clj"}
  {:name "cljs",
   :namespace "clojure.tools.namespace.find",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/b3ab6df0dcec347c1e53de36a99c274b35479267/src/main/clojure/clojure/tools/namespace/find.clj#L29",
   :added "0.3.0",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/b3ab6df0dcec347c1e53de36a99c274b35479267/src/main/clojure/clojure/tools/namespace/find.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.find/cljs",
   :doc
   "Platform definition of file extensions and reader options for\nClojureScript (.cljs and .cljc) source files.",
   :var-type "var",
   :line 29,
   :file "src/main/clojure/clojure/tools/namespace/find.clj"}
  {:arglists ([jar-file]),
   :name "clojure-sources-in-jar",
   :namespace "clojure.tools.namespace.find",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/b3ab6df0dcec347c1e53de36a99c274b35479267/src/main/clojure/clojure/tools/namespace/find.clj#L109",
   :deprecated "0.3.0",
   :added "0.2.0",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/b3ab6df0dcec347c1e53de36a99c274b35479267/src/main/clojure/clojure/tools/namespace/find.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.find/clojure-sources-in-jar",
   :doc
   "DEPRECATED: replaced by sources-in-jar\n\nReturns a sequence of filenames ending in .clj or .cljc found in the\nJAR file.",
   :var-type "function",
   :line 109,
   :file "src/main/clojure/clojure/tools/namespace/find.clj"}
  {:arglists ([dir]),
   :name "find-clojure-sources-in-dir",
   :namespace "clojure.tools.namespace.find",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/b3ab6df0dcec347c1e53de36a99c274b35479267/src/main/clojure/clojure/tools/namespace/find.clj#L57",
   :deprecated "0.3.0",
   :added "0.2.0",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/b3ab6df0dcec347c1e53de36a99c274b35479267/src/main/clojure/clojure/tools/namespace/find.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.find/find-clojure-sources-in-dir",
   :doc
   "DEPRECATED: replaced by find-sources-in-dir\n\nSearches recursively under dir for Clojure source files (.clj, .cljc).\nReturns a sequence of File objects, in breadth-first sort order.",
   :var-type "function",
   :line 57,
   :file "src/main/clojure/clojure/tools/namespace/find.clj"}
  {:arglists ([files] [files platform]),
   :name "find-namespaces",
   :namespace "clojure.tools.namespace.find",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/b3ab6df0dcec347c1e53de36a99c274b35479267/src/main/clojure/clojure/tools/namespace/find.clj#L182",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/b3ab6df0dcec347c1e53de36a99c274b35479267/src/main/clojure/clojure/tools/namespace/find.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.find/find-namespaces",
   :doc
   "Searches a sequence of java.io.File objects (both directories and\nJAR files) for platform source files containing (ns...)\ndeclarations. Returns a sequence of the symbol names of the declared\nnamespaces. Use with clojure.java.classpath to search Clojure's\nclasspath.\n\nOptional second argument platform is either clj (default) or cljs,\nboth defined in clojure.tools.namespace.find.",
   :var-type "function",
   :line 182,
   :file "src/main/clojure/clojure/tools/namespace/find.clj"}
  {:arglists ([dir] [dir platform]),
   :name "find-namespaces-in-dir",
   :namespace "clojure.tools.namespace.find",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/b3ab6df0dcec347c1e53de36a99c274b35479267/src/main/clojure/clojure/tools/namespace/find.clj#L79",
   :added "0.3.0",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/b3ab6df0dcec347c1e53de36a99c274b35479267/src/main/clojure/clojure/tools/namespace/find.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.find/find-namespaces-in-dir",
   :doc
   "Searches dir recursively for (ns ...) declarations in Clojure\nsource files; returns the symbol names of the declared namespaces.\n\nOptional second argument platform is either clj (default) or cljs,\nboth defined in clojure.tools.namespace.find.",
   :var-type "function",
   :line 79,
   :file "src/main/clojure/clojure/tools/namespace/find.clj"}
  {:arglists ([jarfile] [jarfile platform]),
   :name "find-namespaces-in-jarfile",
   :namespace "clojure.tools.namespace.find",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/b3ab6df0dcec347c1e53de36a99c274b35479267/src/main/clojure/clojure/tools/namespace/find.clj#L148",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/b3ab6df0dcec347c1e53de36a99c274b35479267/src/main/clojure/clojure/tools/namespace/find.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.find/find-namespaces-in-jarfile",
   :doc
   "Searches the JAR file for platform source files containing (ns ...)\ndeclarations.  Returns a sequence of the symbol names of the\ndeclared namespaces.\n\nOptional second argument platform is either clj (default) or cljs,\nboth defined in clojure.tools.namespace.find.",
   :var-type "function",
   :line 148,
   :file "src/main/clojure/clojure/tools/namespace/find.clj"}
  {:arglists ([files] [files platform]),
   :name "find-ns-decls",
   :namespace "clojure.tools.namespace.find",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/b3ab6df0dcec347c1e53de36a99c274b35479267/src/main/clojure/clojure/tools/namespace/find.clj#L163",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/b3ab6df0dcec347c1e53de36a99c274b35479267/src/main/clojure/clojure/tools/namespace/find.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.find/find-ns-decls",
   :doc
   "Searches a sequence of java.io.File objects (both directories and\nJAR files) for platform source files containing (ns...)\ndeclarations. Returns a sequence of the unevaluated ns declaration\nforms. Use with clojure.java.classpath to search Clojure's\nclasspath.\n\nOptional second argument platform is either clj (default) or cljs,\nboth defined in clojure.tools.namespace.find.",
   :var-type "function",
   :line 163,
   :file "src/main/clojure/clojure/tools/namespace/find.clj"}
  {:arglists ([dir] [dir platform]),
   :name "find-ns-decls-in-dir",
   :namespace "clojure.tools.namespace.find",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/b3ab6df0dcec347c1e53de36a99c274b35479267/src/main/clojure/clojure/tools/namespace/find.clj#L67",
   :added "0.2.0",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/b3ab6df0dcec347c1e53de36a99c274b35479267/src/main/clojure/clojure/tools/namespace/find.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.find/find-ns-decls-in-dir",
   :doc
   "Searches dir recursively for (ns ...) declarations in Clojure\nsource files; returns the unevaluated ns declarations.\n\nOptional second argument platform is either clj (default) or cljs,\nboth defined in clojure.tools.namespace.find.",
   :var-type "function",
   :line 67,
   :file "src/main/clojure/clojure/tools/namespace/find.clj"}
  {:arglists ([jarfile] [jarfile platform]),
   :name "find-ns-decls-in-jarfile",
   :namespace "clojure.tools.namespace.find",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/b3ab6df0dcec347c1e53de36a99c274b35479267/src/main/clojure/clojure/tools/namespace/find.clj#L136",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/b3ab6df0dcec347c1e53de36a99c274b35479267/src/main/clojure/clojure/tools/namespace/find.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.find/find-ns-decls-in-jarfile",
   :doc
   "Searches the JAR file for source files containing (ns ...)\ndeclarations; returns the unevaluated ns declarations.\n\nOptional second argument platform is either clj (default) or cljs,\nboth defined in clojure.tools.namespace.find.",
   :var-type "function",
   :line 136,
   :file "src/main/clojure/clojure/tools/namespace/find.clj"}
  {:arglists ([dir] [dir platform]),
   :name "find-sources-in-dir",
   :namespace "clojure.tools.namespace.find",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/b3ab6df0dcec347c1e53de36a99c274b35479267/src/main/clojure/clojure/tools/namespace/find.clj#L42",
   :added "0.3.0",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/b3ab6df0dcec347c1e53de36a99c274b35479267/src/main/clojure/clojure/tools/namespace/find.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.find/find-sources-in-dir",
   :doc
   "Searches recursively under dir for source files. Returns a sequence\nof File objects, in breadth-first sort order.\n\nOptional second argument is either clj (default) or cljs, both\ndefined in clojure.tools.namespace.find.",
   :var-type "function",
   :line 42,
   :file "src/main/clojure/clojure/tools/namespace/find.clj"}
  {:arglists ([jarfile entry-name] [jarfile entry-name platform]),
   :name "read-ns-decl-from-jarfile-entry",
   :namespace "clojure.tools.namespace.find",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/b3ab6df0dcec347c1e53de36a99c274b35479267/src/main/clojure/clojure/tools/namespace/find.clj#L119",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/b3ab6df0dcec347c1e53de36a99c274b35479267/src/main/clojure/clojure/tools/namespace/find.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.find/read-ns-decl-from-jarfile-entry",
   :doc
   "Attempts to read a (ns ...) declaration from the named entry in the\nJAR file, and returns the unevaluated form. Returns nil if read\nfails due to invalid syntax or if a ns declaration cannot be found.\n\nOptional third argument platform is either clj (default) or cljs,\nboth defined in clojure.tools.namespace.find.",
   :var-type "function",
   :line 119,
   :file "src/main/clojure/clojure/tools/namespace/find.clj"}
  {:arglists ([jar-file] [jar-file platform]),
   :name "sources-in-jar",
   :namespace "clojure.tools.namespace.find",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/b3ab6df0dcec347c1e53de36a99c274b35479267/src/main/clojure/clojure/tools/namespace/find.clj#L96",
   :added "0.3.0",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/b3ab6df0dcec347c1e53de36a99c274b35479267/src/main/clojure/clojure/tools/namespace/find.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.find/sources-in-jar",
   :doc
   "Returns a sequence of source file names found in the JAR file.\n\nOptional second argument platform is either clj (default) or cljs,\nboth defined in clojure.tools.namespace.find.",
   :var-type "function",
   :line 96,
   :file "src/main/clojure/clojure/tools/namespace/find.clj"}
  {:arglists ([old-sym new-sym source-path dirs]),
   :name "move-ns",
   :namespace "clojure.tools.namespace.move",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/09e1e1fd81faed4e24399bf68bf78e87b32eb68b/src/main/clojure/clojure/tools/namespace/move.clj#L86",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/09e1e1fd81faed4e24399bf68bf78e87b32eb68b/src/main/clojure/clojure/tools/namespace/move.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.move/move-ns",
   :doc
   "ALPHA: subject to change. Moves the .clj source file (found relative\nto source-path) for the namespace named old-sym to new-sym and\nreplace all occurrences of the old name with the new name in all\nClojure source files found in dirs.\n\nThis is a purely textual transformation. It does not work on\nnamespaces require'd or use'd from a prefix list.\n\nWARNING: This function modifies and deletes your source files! Make\nsure you have a backup or version control.",
   :var-type "function",
   :line 86,
   :file "src/main/clojure/clojure/tools/namespace/move.clj"}
  {:arglists ([old-sym new-sym source-path]),
   :name "move-ns-file",
   :namespace "clojure.tools.namespace.move",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/09e1e1fd81faed4e24399bf68bf78e87b32eb68b/src/main/clojure/clojure/tools/namespace/move.clj#L68",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/09e1e1fd81faed4e24399bf68bf78e87b32eb68b/src/main/clojure/clojure/tools/namespace/move.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.move/move-ns-file",
   :doc
   "ALPHA: subject to change. Moves the .clj source file (found relative\nto source-path) for the namespace named old-sym to a file for a\nnamespace named new-sym.\n\nWARNING: This function moves and deletes your source files! Make\nsure you have a backup or version control.",
   :var-type "function",
   :line 68,
   :file "src/main/clojure/clojure/tools/namespace/move.clj"}
  {:arglists ([source old-sym new-sym]),
   :name "replace-ns-symbol",
   :namespace "clojure.tools.namespace.move",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/09e1e1fd81faed4e24399bf68bf78e87b32eb68b/src/main/clojure/clojure/tools/namespace/move.clj#L54",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/09e1e1fd81faed4e24399bf68bf78e87b32eb68b/src/main/clojure/clojure/tools/namespace/move.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.move/replace-ns-symbol",
   :doc
   "ALPHA: subject to change. Given Clojure source as a string, replaces\nall occurrences of the namespace name old-sym with new-sym and\nreturns modified source as a string.",
   :var-type "function",
   :line 54,
   :file "src/main/clojure/clojure/tools/namespace/move.clj"}
  {:file "src/main/clojure/clojure/tools/namespace/parse.cljc",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/b3ab6df0dcec347c1e53de36a99c274b35479267/src/main/clojure/clojure/tools/namespace/parse.cljc",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/b3ab6df0dcec347c1e53de36a99c274b35479267/src/main/clojure/clojure/tools/namespace/parse.cljc#L27",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.parse/clj-read-opts",
   :namespace "clojure.tools.namespace.parse",
   :line 27,
   :var-type "var",
   :doc
   "Map of options for tools.reader/read allowing reader conditionals\nwith the :clj feature enabled.",
   :name "clj-read-opts"}
  {:file "src/main/clojure/clojure/tools/namespace/parse.cljc",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/b3ab6df0dcec347c1e53de36a99c274b35479267/src/main/clojure/clojure/tools/namespace/parse.cljc",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/b3ab6df0dcec347c1e53de36a99c274b35479267/src/main/clojure/clojure/tools/namespace/parse.cljc#L33",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.parse/cljs-read-opts",
   :namespace "clojure.tools.namespace.parse",
   :line 33,
   :var-type "var",
   :doc
   "Map of options for tools.reader/read allowing reader conditionals\nwith the :cljs feature enabled.",
   :name "cljs-read-opts"}
  {:arglists ([form]),
   :name "comment?",
   :namespace "clojure.tools.namespace.parse",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/b3ab6df0dcec347c1e53de36a99c274b35479267/src/main/clojure/clojure/tools/namespace/parse.cljc#L17",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/b3ab6df0dcec347c1e53de36a99c274b35479267/src/main/clojure/clojure/tools/namespace/parse.cljc",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.parse/comment?",
   :doc "Returns true if form is a (comment ...)",
   :var-type "function",
   :line 17,
   :file "src/main/clojure/clojure/tools/namespace/parse.cljc"}
  {:arglists ([decl]),
   :name "deps-from-ns-decl",
   :namespace "clojure.tools.namespace.parse",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/b3ab6df0dcec347c1e53de36a99c274b35479267/src/main/clojure/clojure/tools/namespace/parse.cljc#L117",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/b3ab6df0dcec347c1e53de36a99c274b35479267/src/main/clojure/clojure/tools/namespace/parse.cljc",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.parse/deps-from-ns-decl",
   :doc
   "Given an (ns...) declaration form (unevaluated), returns a set of\nsymbols naming the dependencies of that namespace.  Handles :use and\n:require clauses but not :load.",
   :var-type "function",
   :line 117,
   :file "src/main/clojure/clojure/tools/namespace/parse.cljc"}
  {:arglists ([form]),
   :name "ns-decl?",
   :namespace "clojure.tools.namespace.parse",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/b3ab6df0dcec347c1e53de36a99c274b35479267/src/main/clojure/clojure/tools/namespace/parse.cljc#L22",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/b3ab6df0dcec347c1e53de36a99c274b35479267/src/main/clojure/clojure/tools/namespace/parse.cljc",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.parse/ns-decl?",
   :doc "Returns true if form is a (ns ...) declaration.",
   :var-type "function",
   :line 22,
   :file "src/main/clojure/clojure/tools/namespace/parse.cljc"}
  {:arglists ([rdr] [rdr read-opts]),
   :name "read-ns-decl",
   :namespace "clojure.tools.namespace.parse",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/b3ab6df0dcec347c1e53de36a99c274b35479267/src/main/clojure/clojure/tools/namespace/parse.cljc#L39",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/b3ab6df0dcec347c1e53de36a99c274b35479267/src/main/clojure/clojure/tools/namespace/parse.cljc",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.parse/read-ns-decl",
   :doc
   "Attempts to read a (ns ...) declaration from a reader, and returns\nthe unevaluated form. Returns the first top-level ns form found.\nReturns nil if ns declaration cannot be found. Throws exception on\ninvalid syntax.\n\nNote that read can execute code (controlled by\ntools.reader/*read-eval*), and as such should be used only with\ntrusted sources. read-opts is passed through to tools.reader/read,\ndefaults to clj-read-opts",
   :var-type "function",
   :line 39,
   :file "src/main/clojure/clojure/tools/namespace/parse.cljc"}
  {:arglists ([lib]),
   :name "remove-lib",
   :namespace "clojure.tools.namespace.reload",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/27194f2edfe3f5f9e1343f993beca4b43f0bafe8/src/main/clojure/clojure/tools/namespace/reload.clj#L15",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/27194f2edfe3f5f9e1343f993beca4b43f0bafe8/src/main/clojure/clojure/tools/namespace/reload.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.reload/remove-lib",
   :doc
   "Remove lib's namespace and remove lib from the set of loaded libs.",
   :var-type "function",
   :line 15,
   :file "src/main/clojure/clojure/tools/namespace/reload.clj"}
  {:arglists ([tracker]),
   :name "track-reload",
   :namespace "clojure.tools.namespace.reload",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/27194f2edfe3f5f9e1343f993beca4b43f0bafe8/src/main/clojure/clojure/tools/namespace/reload.clj#L43",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/27194f2edfe3f5f9e1343f993beca4b43f0bafe8/src/main/clojure/clojure/tools/namespace/reload.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.reload/track-reload",
   :doc
   "Executes all pending unload/reload operations on dependency tracker\nuntil either an error is encountered or there are no more pending\noperations.",
   :var-type "function",
   :line 43,
   :file "src/main/clojure/clojure/tools/namespace/reload.clj"}
  {:arglists ([tracker]),
   :name "track-reload-one",
   :namespace "clojure.tools.namespace.reload",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/27194f2edfe3f5f9e1343f993beca4b43f0bafe8/src/main/clojure/clojure/tools/namespace/reload.clj#L21",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/27194f2edfe3f5f9e1343f993beca4b43f0bafe8/src/main/clojure/clojure/tools/namespace/reload.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.reload/track-reload-one",
   :doc
   "Executes the next pending unload/reload operation in the dependency\ntracker. Returns the updated dependency tracker. If reloading caused\nan error, it is captured as ::error and the namespace which caused\nthe error is ::error-ns.",
   :var-type "function",
   :line 21,
   :file "src/main/clojure/clojure/tools/namespace/reload.clj"}
  {:arglists ([]),
   :name "clear",
   :namespace "clojure.tools.namespace.repl",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/0ce6646bb59a319a864faad5d01f1bc31c79e932/src/main/clojure/clojure/tools/namespace/repl.clj#L170",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/0ce6646bb59a319a864faad5d01f1bc31c79e932/src/main/clojure/clojure/tools/namespace/repl.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.repl/clear",
   :doc
   "Clears all state from the namespace/file tracker. This may help\nrepair the namespace tracker when it gets into an inconsistent\nstate, without restarting the Clojure process. The next call to\n'refresh' will reload all source files, but may not completely\nremove stale code from deleted files.",
   :var-type "function",
   :line 170,
   :file "src/main/clojure/clojure/tools/namespace/repl.clj"}
  {:arglists ([] [namespace]),
   :name "disable-reload!",
   :namespace "clojure.tools.namespace.repl",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/0ce6646bb59a319a864faad5d01f1bc31c79e932/src/main/clojure/clojure/tools/namespace/repl.clj#L120",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/0ce6646bb59a319a864faad5d01f1bc31c79e932/src/main/clojure/clojure/tools/namespace/repl.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.repl/disable-reload!",
   :doc
   "Adds metadata to namespace (or *ns* if unspecified) telling\n'refresh' not to load it. Implies disable-unload! also.\n\nWarning: Aliases to reloaded namespaces will break.",
   :var-type "function",
   :line 120,
   :file "src/main/clojure/clojure/tools/namespace/repl.clj"}
  {:arglists ([] [namespace]),
   :name "disable-unload!",
   :namespace "clojure.tools.namespace.repl",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/0ce6646bb59a319a864faad5d01f1bc31c79e932/src/main/clojure/clojure/tools/namespace/repl.clj#L111",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/0ce6646bb59a319a864faad5d01f1bc31c79e932/src/main/clojure/clojure/tools/namespace/repl.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.repl/disable-unload!",
   :doc
   "Adds metadata to namespace (or *ns* if unspecified) telling\n'refresh' not to unload it. The namespace may still be reloaded, it\njust won't be removed first.\n\nWarning: Aliases to reloaded namespaces will break.",
   :var-type "function",
   :line 111,
   :file "src/main/clojure/clojure/tools/namespace/repl.clj"}
  {:arglists ([& options]),
   :name "refresh",
   :namespace "clojure.tools.namespace.repl",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/0ce6646bb59a319a864faad5d01f1bc31c79e932/src/main/clojure/clojure/tools/namespace/repl.clj#L128",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/0ce6646bb59a319a864faad5d01f1bc31c79e932/src/main/clojure/clojure/tools/namespace/repl.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.repl/refresh",
   :doc
   "Scans source code directories for files which have changed (since\nthe last time this function was run) and reloads them in dependency\norder. Returns :ok or an error; sets the latest exception to\nclojure.core/*e (if *e is thread-bound).\n\nThe directories to be scanned are controlled by 'set-refresh-dirs';\ndefaults to all directories on the Java classpath.\n\nOptions are key-value pairs. Valid options are:\n\n    :after   Namespace-qualified symbol naming a zero-argument\n             function to be invoked after a successful refresh. This\n             symbol will be resolved *after* all namespaces have\n             been reloaded.",
   :var-type "function",
   :line 128,
   :file "src/main/clojure/clojure/tools/namespace/repl.clj"}
  {:arglists ([& options]),
   :name "refresh-all",
   :namespace "clojure.tools.namespace.repl",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/0ce6646bb59a319a864faad5d01f1bc31c79e932/src/main/clojure/clojure/tools/namespace/repl.clj#L147",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/0ce6646bb59a319a864faad5d01f1bc31c79e932/src/main/clojure/clojure/tools/namespace/repl.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.repl/refresh-all",
   :doc
   "Scans source code directories for all Clojure source files and\nreloads them in dependency order.\n\nThe directories to be scanned are controlled by 'set-refresh-dirs';\ndefaults to all directories on the Java classpath.\n\nOptions are key-value pairs. Valid options are:\n\n    :after   Namespace-qualified symbol naming a zero-argument\n             function to be invoked after a successful refresh. This\n             symbol will be resolved *after* all namespaces have\n             been reloaded.",
   :var-type "function",
   :line 147,
   :file "src/main/clojure/clojure/tools/namespace/repl.clj"}
  {:arglists ([& dirs]),
   :name "set-refresh-dirs",
   :namespace "clojure.tools.namespace.repl",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/0ce6646bb59a319a864faad5d01f1bc31c79e932/src/main/clojure/clojure/tools/namespace/repl.clj#L164",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/0ce6646bb59a319a864faad5d01f1bc31c79e932/src/main/clojure/clojure/tools/namespace/repl.clj",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.repl/set-refresh-dirs",
   :doc
   "Sets the directories which are scanned by 'refresh'. Supports the\nsame types as clojure.java.io/file.",
   :var-type "function",
   :line 164,
   :file "src/main/clojure/clojure/tools/namespace/repl.clj"}
  {:arglists ([tracker depmap]),
   :name "add",
   :namespace "clojure.tools.namespace.track",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/f0c9442ebe692511c35b33b7620087cb9c1b3db5/src/main/clojure/clojure/tools/namespace/track.cljc#L39",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/f0c9442ebe692511c35b33b7620087cb9c1b3db5/src/main/clojure/clojure/tools/namespace/track.cljc",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.track/add",
   :doc
   "Returns an updated dependency tracker with new/updated namespaces.\n\nDepmap is a map describing the new or modified namespaces. Keys in\nthe map are namespace names (symbols). Values in the map are sets of\nsymbols naming the direct dependencies of each namespace. For\nexample, assuming these ns declarations:\n\n    (ns alpha (:require beta))\n    (ns beta (:require gamma delta))\n\nthe depmap would look like this:\n\n    {alpha #{beta}\n     beta  #{gamma delta}}\n\nAfter adding new/updated namespaces, the dependency tracker will\nhave two lists associated with the following keys:\n\n    :clojure.tools.namespace.track/unload\n        is the list of namespaces that need to be removed\n\n    :clojure.tools.namespace.track/load\n        is the list of namespaces that need to be reloaded\n\nTo reload namespaces in the correct order, first remove/unload all\nnamespaces in the 'unload' list, then (re)load all namespaces in the\n'load' list. The clojure.tools.namespace.reload namespace has\nfunctions to do this.",
   :var-type "function",
   :line 39,
   :file "src/main/clojure/clojure/tools/namespace/track.cljc"}
  {:arglists ([tracker names]),
   :name "remove",
   :namespace "clojure.tools.namespace.track",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/f0c9442ebe692511c35b33b7620087cb9c1b3db5/src/main/clojure/clojure/tools/namespace/track.cljc#L88",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/f0c9442ebe692511c35b33b7620087cb9c1b3db5/src/main/clojure/clojure/tools/namespace/track.cljc",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.track/remove",
   :doc
   "Returns an updated dependency tracker from which the namespaces\n(symbols) have been removed. The ::unload and ::load lists are\npopulated as with 'add'.",
   :var-type "function",
   :line 88,
   :file "src/main/clojure/clojure/tools/namespace/track.cljc"}
  {:arglists ([]),
   :name "tracker",
   :namespace "clojure.tools.namespace.track",
   :source-url
   "https://github.com/clojure/tools.namespace/blob/f0c9442ebe692511c35b33b7620087cb9c1b3db5/src/main/clojure/clojure/tools/namespace/track.cljc#L111",
   :raw-source-url
   "https://github.com/clojure/tools.namespace/raw/f0c9442ebe692511c35b33b7620087cb9c1b3db5/src/main/clojure/clojure/tools/namespace/track.cljc",
   :wiki-url
   "http://clojure.github.com/tools.namespace//clojure.tools.namespace-api.html#clojure.tools.namespace.track/tracker",
   :doc "Returns a new, empty dependency tracker",
   :var-type "function",
   :line 111,
   :file "src/main/clojure/clojure/tools/namespace/track.cljc"})}
