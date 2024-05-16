DOM

 *The Document Object Model (DOM) is a programming API for HTML and XML documents.

 *It defines the logical structure of documents and the way a document is accessed 
  and manipulated.
  In the Document Object Model, documents have a logical structure which is 
  very much like a tree

 *programmers can create and build documents, navigate their structure, and add, 
  modify, or delete elements and content. Anything found in an HTML or XML document

 *the interfaces and objects used to represent and manipulate a document
 *the semantics of these interfaces and objects - including both behavior and 
  attributes
Diagram:
          ->DOM

Types of DOM present:
1)The Legacy DOM //old version
2)The W3C DOM //** support all morden browsers
3)The IE4 DOM(microsoft ie4 support)
 from IE5--W3C DOM

The DOM programming interface is the properties and methods of each object.


A property is a value that you can get or set (like changing the content of an HTML element).

InnerHTML property:
The innerHTML Property is used along with getElementByID within you javascript
code to refer to an HTML element and change its contents

Property			Description
element.innerHTML =  new html content	Change the inner HTML of an element
element.attribute = new value	Change the attribute value of an HTML element
element.style.property = new style	Change the style of an HTML element

A method is an action you can do (like add or deleting an HTML element).
write("String(Message)")		writes the given string on the doucment.
writeln("string(Message)")	writes the given string on the doucment with newline character at the end.
getElementById()	returns the element having the given id value.
getElementsByName()	returns all the elements having the given name value.
getElementsByTagName()	returns all the elements having the given tag name.
getElementsByClassName()	returns all the elements having the given class name.

Method	Description
element.setAttribute(attribute, value)	Change the attribute value of an HTML element

Adding and Deleting Elements
Method	Description
document.createElement(element)	Create an HTML element
document.removeChild(element)	Remove an HTML element
document.appendChild(element)	Add an HTML element
document.replaceChild(new, old)	Replace an HTML element
document.write(text)	Write into the HTML output stream
