 3*4
    c0          c1   	       	c2  		c3
 
 r0   A[0][0]   A[0][1]  A[0][2] 		A[0][3] 
 
  r1  A[1][0]  A[1][1]  A[1][2] 	A[1][3] 
  
   r2 
   A[2][0] A[2][1]  A[2][2] 	A[2][3]  
   
   
   Datatype [][] nameofArray = new Datatype [rsize][csize];
   
   Datatype  nameofArray [][] = new Datatype [rsize][csize];
   
   Datatype []NameofArray[]=new Datatype[rsize][csize];
   
   int [][]M=new int[2][3];
   row =2
   col =3
   
        c0          c1         c2
r0     A[0][0]		A[0][1]    A[0][2]

r1     A[0][0]		A[1][1]    A[1][2]

jagged Array: variable number of columns each row;

3*4  
       M.lenght===================>number of row =3

        c0           c1               c2                 c3
        
 r0    A[0][0]      A[0][1]        A[0][2]             A[0][3]    M[0].length========>number of cols in o row---4
 
 r1    A[1][0]      A[1][1]        A[1][2]             A[1][3]
 
 r2    A[2][0]      A[2][1]        A[2][2]             A[2][3]

  // jagged Array/Matrix
                M.length==============>number of rows=3
                
 r0    A[0][0]      A[0][0]        A[0][0]             A[0][0]    M[0].length========>number of cols in o row---4
 
 r1    A[0][0]      A[0][0]        A[0][0]                          M[1].length=3
 
 r2    A[0][0]      A[0][0]        A[0][0]             A[0][0]      M[2].length4
               
  
                