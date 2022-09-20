# Why?

Working with Jackson Yaml serializer is quite inuitive. You basically turn a class and its (sub)objects into a Yaml structure.
When it comes to "named" fields, or dynamique (non list)content, you may have to add a node using java code.
This is the purpose of JSonNode.

# What?

jsonNodeYamlExample is a small project used to show how to add a new (named) node to an existing YamL structure.
It starts from a Class (Staff) with a basic field.
Then we add a series of named *Worker* as a new node, using JSONNode object, then eventually we turn it into a YamL output


# HOW TO

import it in your favorite IDE (as "Mavec project"), and run the main().


