# jaxb-custom-bindings-example
A basic example on how to use jaxb with a bindings file

## Intention
This example illustrates how to use a binding file to substitute a type
that is produced by default as part of the xsd -> java transformation,
to a custom type.

## How to use
There is not much to do, just compile the project:

```
mvn clean verify
```

There are two XSD files, one called SimpleResponse.xsd and another one
called XjbResponse.xsd. The second one has also a binding file
associated with it (XjbResponse.xjb), which essentially describes that
we want to substitute the XmlGregorianCalendar with a different type
(LocalDate for an xml date and LocalTime for an xml time type).
Once you compile the project, you can see the generated java classes
and how the binding file has influenced the java types used in the
respective class.
