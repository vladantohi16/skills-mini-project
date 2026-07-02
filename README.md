# Skills Mini Project

Proiect Java minimal, folosit ca sandbox pentru a exersa lecțiile din cursul
**"Introduction to Agent Skills"** (Anthropic / Claude Code).

Conținutul aplicației (un calculator simplu) nu contează — scopul lui este
doar să ofere un repo real, cu cod real și istoric de commit-uri, pe care să
poți testa skill-uri de tip Claude Code: generare de descrieri de PR din
`git diff`, skill matching, prioritizare Enterprise/Personal/Project/Plugins
etc.

## Structură

```
skills-mini-project/
├── pom.xml
├── src/
│   ├── main/java/com/skillspractice/
│   │   ├── Calculator.java
│   │   └── Main.java
│   └── test/java/com/skillspractice/
│       └── CalculatorTest.java
└── README.md
```

## Cum rulezi proiectul

Ai nevoie de JDK 17+ și Maven instalate.

```bash
# compilează și rulează testele
mvn test

# compilează și rulează aplicația
mvn compile exec:java -Dexec.mainClass="com.skillspractice.Main"

# sau construiește jar-ul și rulează-l
mvn package
java -jar target/skills-mini-project.jar
```

## Pentru cursul de Agent Skills

Idei de exersat pe acest repo:
- Creează un skill personal (`~/.claude/skills/`) care generează descrieri de
  PR din `git diff main...HEAD`.
- Adaugă un skill la nivel de proiect (`.claude/skills/`) și observă cum
  prioritatea Project > Personal se manifestă când există un skill cu
  același nume în ambele locații.
- Fă modificări mici în `Calculator.java` (ex. adaugă o metodă `power`),
  deschide un PR și testează trigger-ele de limbaj natural pentru skill-uri.
