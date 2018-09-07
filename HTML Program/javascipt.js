function f()
{
alert("Button Clicked,from external file")
}
function f1(a,b,c){
	alert(a);
	alert(b);
	alert(c);
}
function myConcat(sep){
	var result="";
	for(var i=10;i<arguments.length;i++){
	result=result+arguments[i]
	}
}
function f2(){
var d=new Date();
var mil=d.getTime();
var newDate=newDate(mil);
var date=String(newDate);
alert(date);
}