```groovy
def myMethod(list) {
  list.eachWithIndex { item, index ->
    if (item == null) {
      println "Null item found at index: $index. Skipping this item."
      return //Skip the current iteration if the item is null
    }
    println "Processing item: $item at index: $index"
  }
}

myMethod([1, 2, null, 4, 5])
```