//web programming---->
   UI(client side)----->web browser(Intract)----Data
   UI Tech--->(HTML,css) +(javascript-jquery->angularjs--->nodejs)+Intrucution of nodejs,angularjs

HTML
HTTP
HTTPS

Interanet 
              LAN
Internet
               WWW         
Extranet
               MAN
ipaddress 				macaddress

web---->web is collection of eletronic web pages/website----->
Internet:network of network

web page--->web page is document written in html----processed by 
            webbrower----->to display web content
			
Types of web page---->
static web page: //client  cant intract with web page
       HTML,CSS
Dynamic web page: //clent can intract with web page
       HTML,CSS,JavaScript

website:collection of web page with web documents are known as 
        web site
Static web site:
//any website using html,css,javascipt(client site programming)
// such a web side is known as static web site

Dynamic web site
//any website using (HTML,CSS,javascipt)(client side programming)
  with server side programing +Database programming is 
  known as Dynamic website/wep application



Markup language: web language which use tags as command interpreted by web browser,its error free(cant show error if any tag is wrong)
                 cant support datatype,variable and control structures like(if then else ,swich loop... etc)

Types of Marksup Languages
1.GML(generalized markup language)
2.SGML(Standard generalized markup language)
3.HTML(HyperText markup language)
4.XHML (Extensible markup language)



HTML:(Hypertext markup language)
It is language for web browsers,with meaning full tags 
or markup language to design web pages
Features of HTML:
1)It is browser mother language
2)It is global language
3)It is collection of tags and elements
4)It is markup language

HTML versions
HTML 1.0 1994
HTML 2.0 1995
HTML 3.0 1997
HTML 4.0 1999
2000	W3C Recommendation: XHTML 1.0
2008	WHATWG HTML5 First Public Draft
2012	WHATWG HTML5 Living Standard(advanced markup language for mobiles)
2014	W3C Recommendation: HTML5
2016	W3C Candidate Recommendation: HTML 5.1(for smart phones,widges,gadgets,devices)
2017   5.2
Define Tag: It is special kind of text,placed between left angular brace and right angular brace(<>)

Types of tag:
1)paired tag
2)non paired tag

1)paired tag:
These tags are having opening and closing tags
ex:
2)non paired and single tag
the tag that have only opening tags


comment in html:Comment are non executable statement or ignore statements.
<!--  single or mul  -->

Structure of HTML
<! DOCTYPE>
<html>
<head>
<title></title>
<link><link> 
<script></script>
<style></style>
<meta></meta>
</head>

<body>
<!-- all visible content of web page put here -->
</body>

</html>

HTML Elements
 start tag       //Content         end tag
<p color="red"> This is paragraph </p>
   att =value

		HTML(Use tags)

SGML(mother)                   +  XHTML---strict HTML with cross browser support

              
                 XML(extensible markup language)

XHTML rules
1. It must opening and closing tag in same case(prefered lowercase tags)
	<html>Ramaasoft</html>	correct
	<HTML>Ramaasoft</HTML>	correct
	<HTML>Ramaasoft</Html>	incorrect
	<Html>Ramaasoft</Html>	correct

2. if a tag has some attributes, their values must be placed in quotation marks
     <body  background=yellow />		incorrect
	

3. nesting of tags is done in stack order/lifo
	<html><body><p>Ramaasoft</p></body></html>

4. single tags must be ended
	<tag>		<br>	html
	<tag />		<br />  xhtml


How to write HTML(software which support) WHSIWYG EDITORS
WHATWG


HTML:
            head tag
                      --->title
                      --->base
		      --->style
		      --->link
		      --->script
		      --->meta

		      --->object
            
		           			--->Frame/Frameset

		body tag
			--->h1--h6
			--->p
			--->ul,ol
			--->img
			--->table
			--->form(input,option,button..)
             
Types of Tag
1.Document Outline tags
  <!DOCTYPE>
  <html>
  <head>
  <body>
2.Comment  <!--  -->

3.Page information
<title>  set page title
<base/> ---->base url
<meta/>----->meta data(information about page)
<link/>----->relevant resource(fevicon,image,style...)
<style></style>----> to define interal style
<script></script>----to define script(internal) or add external

4.Section Tags/Document Structure
  <h1>..<h6>------>heading largest to small
  <p></p>  to define a paragrph
  <br> or <br/> insert line break
  <hr> -----> horizontal ruler   
  <span>Inline section</span>
  <div>A section in a document/page</div>  
  
 
5.Text formatting Tags
         <em></em>-----> emphasize with italics
	 <strong></strong>---> emphasize with bold
	 <font></font>----> to set font size(max=7)and color
         <sub></sub>---->subscript
         <sup></sup>--->superscript
	 <del></del>---->strikethrough
	 <code></code>--->insert codes
	 <pre></pre>---->preserve formating
         <blockquote></blockquote> create a blockquote

         <b></b>
	 <i></i>
6.List Tags
  <ol></ol>  ordered list
  <ul></ul>  unordered list
              <li> </li> individual items in list
  <dl></dl> A description list
	 <dt>Define term name</dt>
         <dd>term description</dd>

7.Link tags
  <a href=""></a>

8.Table tags
   <table></table>	
9.Form tags
  <form>

  <input>
  <select>
  <option>
  <textarea>
  <button>
  <fieldset>
  <legend>
10.image tags
   <img>
   <map>
   <area>
