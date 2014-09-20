I'm On A Boat Server Extension
================================

This is an unmanaged extension that extends the Neo4j API to provide endpoints that power I'm On A Boat.

`GET .../onaboat/intersects?polygon=WKTPOLYGON`

Where WKTPOLYGON is a polygon string in WKT format

`POST .../onaboat/observation`

Body:

~~~json
{
    "lat": -147.3224,
    "lon": 36.2321,
    "x": -1.004,
    "y": 0.0273,
    "z": 923.009,
    "timestamp": 12478384000
}
~~~

## Dependencies

* Neo4j Spatial
* Google Gson

See step 3 below.

## Installation
1. Build it: 

        mvn clean package
        
   **NOTE:** use `-Dskiptests` to build without tests.

2. Copy target/unmanaged-extension-template-1.0.jar to the plugins/ directory of your Neo4j server.

3. Copy target/dependency/gson-2.2.4.jar and target/dependency/neo4j-spatial-0.13-neo4j-2.1.2.jar to the plugins/ directory of your Neo4j server.

4. Configure Neo4j by adding a line to conf/neo4j-server.properties:

        org.neo4j.server.thirdparty_jaxrs_classes=org.neo4j.example.unmanagedextension=/

5. Start Neo4j server.

6. Query it over HTTP:

        curl http://localhost:7474/example/helloworld

