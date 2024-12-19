package com.jtc;

public class StreamAPI {
	
/*
 * Stream Api intreduce in java 1.8v
 >Stream api is used to process the data.
 >Collection are are used to store the data
 >Stream API is one of the major features added in java 1.8v
 >Stream in java can be defined as squence of elements the comes from a source.
 >source of data for the stream can be array or collection.
 
 
 Important Points about streams
 ===============================
 >Stream is not a data structure,Stream means bunch of operetions
 applied on source data.Source can be collection or array.
 
 >stream will not change original data structure 
 of the source (it will just process the given by the source)
 
Stream Creation
=================
>in java we can create stream in two ways
     >stream.of(a,b,c,d...) method
     >stream() method
     
     
     
 Stream Operation
 =================
 
     >Stream API provide several methods to perform operations on the data
     >We can devide Stream api method into 2 types
          1)Intermediate operation method
          
          2)Terminal operation method
          
          
    >Intermediate operation method will perform operations on the stream and return 
    new Stream.
    ex- filter(),map() etc...
    
    >Terminal operation methods will take input and will provide result as output.
      Ex-   count();
   
          
          
 Filtering with Streams
 =============================
 >filtering means getting required data from original data  
 
         ex- get only even numbers from given numbers
         ex-geting whose salary is  >=100000
    
    >To apply filter on the data ,stream api provide filter() method
     ex-stream filter (predicate p)
     
     
     
     
 Mapping Operation
 ======================
 >Mapping operations are belongs to intermediate operation in the stream api.
 >Mapping operation are used to transform the stream elements and return 
 transformed data element as new Stream.
 
  Ex-Stream map(Function function);
   
    
    
    FlatMap()
    ====================
    
    >It is used to flaten list of stream in to single stream.
    
    map transforms each element into another form (i.e., one-to-one mapping).
    flatMap transforms each element into a stream (or another iterable), and then flattens the result into a single stream
     (i.e., one-to-many mapping).
     
     
   Slicing Operation with Stream
   ================================
   
   =>all are  three method intermediate operation
   they will perform operation and return stream.
   
   1)distinct()   =>to get unique element of stream
   2)limit()      =>get list of element from stream based on given size.
   3)skip()       =>It is used to skip given number of elements from  starting position of the stream.
 
 
 
 ===============================
 Matching Operation With Stream
 ===============================
 =>Matching operation are terminal operation
 >     
 
      >anyMatch(Predicate p)
      >noMatch(Predicate p)
      >allMatch(Predicate p)
      
      >the above 3 methods are belonging to terminal operation bcz they will do operation and they will return result directly.
      >all methods give the result as true false







Parallel streams
=======================
>Generally streams will execute in  sequence order
>to improve execution process of the stream we can use program steams
>parallel streams introduced to improve performance of the  program.





 */
	

} 
