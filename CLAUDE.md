# Project Standards

## Calculator methods

Every public method added to `Calculator.java` must:
- Validate its inputs explicitly
- Throw a descriptive exception (`IllegalArgumentException` or `ArithmeticException`) on invalid input
- Never return a sentinel value (like `-1` or `NaN`) to signal an error

This applies to every new method, even if the user doesn't mention validation explicitly.