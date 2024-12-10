# Unexpected Behavior of map() on Mutable Lists in Kotlin

This example demonstrates a common pitfall when using the `map()` function in Kotlin with mutable lists.  Unlike some other languages, `map()` in Kotlin does *not* modify the original list in place; instead, it returns a *new* list containing the transformed elements.

This can lead to unexpected behavior if you're expecting `map()` to alter the original list directly.

**Files:**

* `bug.kt`: Shows the unexpected behavior of `map()` with a `MutableList`.
* `bugSolution.kt`: Demonstrates how to correctly modify a `MutableList` using `map` with `mapTo`.