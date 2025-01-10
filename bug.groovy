```groovy
def myMethod(list) {
  list.eachWithIndex { item, index ->
    if (item == null) {
      println "Null item found at index: $index"
      // Handle null item appropriately, e.g., remove it or throw an exception
    }
    // Process the item
  }
}

myMethod([1, 2, null, 4, 5])
```