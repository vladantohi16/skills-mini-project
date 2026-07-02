---
name: build-check
description: Verifies the project builds and all tests pass. Use when the user asks to check the build, run tests, or verify everything works.
allowed-tools: Bash, Read
---

When asked to verify the build:
1. Run `mvn -q test` from the project root
2. Report whether the build succeeded and how many tests passed
3. If it fails, show the relevant error output