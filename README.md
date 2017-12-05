                                     Report

Hash tables are best suited for speed of finding things in the table.  They are much faster at finding things as compaired to 
B-Trees or 2-3-4 Trees.  B-Trees and 2-3-4 Trees are best suited for storing data in sorted order.  Hash Tables on the other hand 
cannot keep data in order so if that is a trait that you are looking for use another method.  I like B-Trees better than the
2-3-4 Trees as the code complexity and overhead is much smaller than that of the 2-3-4 Tree.
  
Overall I would have to say that no single data type is better than the other.  They all have their specific use cases and 
specific advantages and disadvantages over the other types.  B-Trees are the easiest to code and store data in order but can 
become lopsided.  2-3-4 Trees on the other hand remain balanced at the cost of partitioning and additional insertion time.  
however retrieving data from a 2-3-4 should be faster in every respect.  Hash tables an the other hand can find data extremely 
quickly because it knows exactly where to look baised of the calculated hash.  Hashes seem to be popular for breaking MD5, SHa1 etc 
