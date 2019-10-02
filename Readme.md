= Access a OpenAPI endpoint using SQL using Teiid

This example shows a very simple demo of reading a `cats` service, which is defined under `cats` subfolder using Teiid and exposing the access to this service using SQL.

== cats

 This is simple spring boot app, that exposes a endpoint called `/cats` with an array and simple nested elements. To run the demo build the project and run

java -jar target/cats-{version}.jar

== api-demo

this is a spring boot based Teiid application that is configured to read `http://localhost:8080/openapi` endpoint to get the open api definition of the service. Once the document is read, it will expose endpoints as stored procedures in the virtual database configured in the `api-demo/src/main/resources/api-demo-vdb.ddl` file.

you can also build project using maven and execute as 

java -jar target/api-demo-{version}.jar


== testing

once both applications started make sure there are no errors, then using a SQL client `squirrel` connect to the Teiid using 

url: jdbc:teiid:demo@mm://localhost:31000
user: any
pass: any

using Teiid JDBC driver and issue a command like

`select * from (exec customUsingGET()) as X`

and you should see tabular results like

```
breed                                               moods                                               name                                                owner_address                                       owner_name                                          traits_Traits_trait                                 
Persian Cat                                         <UnknownType (2,003)>                               Aldo                                                123 Elm St, Chicago, IL                             Joe                                                 Skittishness                                        
Persian Cat                                         <UnknownType (2,003)>                               Aldo                                                123 Elm St, Chicago, IL                             Joe                                                 Outgoingness                                        
Rag Doll                                            <UnknownType (2,003)>                               Ginger                                              123 Market St, Newyork, NY                          David                                               Dominance                                           
Rag Doll                                            <UnknownType (2,003)>                               Ginger                                              123 Market St, Newyork, NY                          David                                               Spontaneity                                         

```

Now you can join this table with others just like a relational table. You can also create view called `cats` in the VDB and say

`select * from cats` to get back same results
