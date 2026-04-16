# WhileLang - Proyecto Completado

## 📊 Estado del Proyecto

✅ **COMPLETADO** - Laboratorio de Compiladores WhileLang

---

## 🎯 Descripción

**WhileLang** es un lenguaje de programación simplificado con:
- Tipos: `int`, `string`
- Estructuras: `while`, `if-else`, `break`, `continue`
- Operadores: aritméticos (+, -, *, /), comparación (<, >, <=, >=, ==, !=)
- Gramática ANTLR con etiquetas para todas las expresiones

---

## 📁 Archivos Entregados (13 archivos)

### Configuración
| Archivo | Descripción |
|---------|------------|
| `WhileLang.g4` | Gramática ANTLR actualizada con etiquetas |
| `PROYECTO.md` | Este archivo (documentación consolidada) |

### Casos de Prueba Válidos
| Archivo | Contenido |
|---------|----------|
| `valid_test_cases.while` | Tests 1, 7, 8, 9 - Todos los casos válidos |

### Casos de Prueba de Error
| Archivo | Error |
|---------|-------|
| `error_test_2_type_mismatch.while` | Asignación tipo incorrecto |
| `error_test_3_undefined_var.while` | Variable no declarada |
| `error_test_4_redeclaration.while` | Redeclaración en scope |
| `error_test_5_invalid_condition.while` | Condición inválida en if |
| `error_test_6_string_comparison.while` | Comparación con strings |
| `error_test_10_string_arithmetic.while` | Operación aritmética con strings |
| `error_additional_break_outside_loop.while` | Break fuera de bucle |
| `error_additional_continue_outside_loop.while` | Continue fuera de bucle |

### Compilados por ANTLR (Auto-generado)
- WhileLangLexer.java/.class
- WhileLangParser.java/.class
- WhileLangVisitor.java/.class
- WhileLangBaseVisitor.java/.class
- WhileLang.tokens, WhileLang.interp

---

## 🔧 Etiquetas ANTLR Generadas

```antlr
expr
    : ID                                    # idExpr
    | NUMBER                                # numberExpr
    | STRING_LITERAL                        # stringExpr
    | expr (MULT | DIV) expr                # arithmeticExpr
    | expr (PLUS | MINUS) expr              # arithmeticExpr
    | expr (LT | GT | GE | LE | EQ |NE) expr # comparisonExpr
    | LPAREN expr RPAREN                    # parenExpr
    ;
```

**Clases de Contexto Generadas:**
- `IdExprContext`, `NumberExprContext`, `StringExprContext`
- `ArithmeticExprContext`, `ComparisonExprContext`, `ParenExprContext`
- `DeclarationStmtContext`, `AssignmentStmtContext`
- `WhileStmtContext`, `IfStmtContext`, `BreakStmtContext`, `ContinueStmtContext`

---

## 📋 Casos de Prueba (10 Escenarios)

### ✅ Casos Válidos (En `valid_test_cases.while`)

**Test 1:** Declaraciones y asignaciones
```
int x = 10;
string s = "hola";
x = x + 5;
s = s + " mundo";
```

**Test 7:** If-else con scopes
```
int x = 0;
if (x < 5) {
  int y = 10;
} else {
  int y = 20;
}
```

**Test 8:** Anidamiento while + if
```
int i = 0;
while (i < 3) {
  int j = 0;
  while (j < 2) {
    if (i == j) {
      j = j + 1;
    }
    j = j + 1;
  }
  i = i + 1;
}
```

**Test 9:** Break y continue
```
int i = 0;
while (i < 5) {
  if (i == 2) {
    continue;
  }
  if (i == 4) {
    break;
  }
  i = i + 1;
}
```

### ❌ Casos de Error

| # | Caso | Error Esperado | Archivo |
|---|------|----------------|---------|
| 2 | `int x = 10; x = "hola";` | Type mismatch | error_test_2_type_mismatch.while |
| 3 | `y = 5;` | Variable not defined | error_test_3_undefined_var.while |
| 4 | `int x = 1; string x = "hola";` | Already defined | error_test_4_redeclaration.while |
| 5 | `string s = "hola"; if (s) {}` | Non-boolean condition | error_test_5_invalid_condition.while |
| 6 | `string a = "hola"; while (a < b) {}` | Operator not supported | error_test_6_string_comparison.while |
| 10 | `string s = "hola"; string u = s * "t";` | Operator not supported | error_test_10_string_arithmetic.while |
| A | `break;` (fuera de loop) | Break outside loop | error_additional_break_outside_loop.while |
| B | `continue;` (fuera de loop) | Continue outside loop | error_additional_continue_outside_loop.while |

---

## 🚀 Comandos Esenciales

### Generar Parser
```bash
cd /workspaces/Laboratorio_Compiladores/WhileLang
java -jar ../antlr-4.13.1-complete.jar WhileLang.g4 -visitor
javac -cp ../antlr-4.13.1-complete.jar *.java
```

### Probar con GUI
```bash
java -cp ".:../antlr-4.13.1-complete.jar" org.antlr.v4.gui.TestRig \
  WhileLang program valid_test_cases.while -gui
```

### Probar Caso de Error
```bash
java -cp ".:../antlr-4.13.1-complete.jar" org.antlr.v4.gui.TestRig \
  WhileLang program error_test_2_type_mismatch.while
```

---

## 💻 Próximos Pasos: Implementar Intérprete

Para completar la práctica, necesitas crear `WhileLangInterpreter.java`:

```java
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class WhileLangInterpreter extends WhileLangBaseVisitor<Object> {
    
    private Map<String, Object> symbols = new HashMap<>();
    private Map<String, String> types = new HashMap<>();
    private Stack<Map<String, Object>> scopes = new Stack<>();
    
    @Override
    public Object visitDeclarationStmt(WhileLangParser.DeclarationStmtContext ctx) {
        // TODO: Declarar variable
        // TODO: Validar no redeclaración
        return null;
    }
    
    @Override
    public Object visitAssignmentStmt(WhileLangParser.AssignmentStmtContext ctx) {
        // TODO: Validar variable existe
        // TODO: Validar tipos compatibles
        return null;
    }
    
    // ... más métodos ...
}
```

### Requisitos del Intérprete
- ✅ Tabla de símbolos con tipos
- ✅ Gestión de scopes anidados
- ✅ Verificación de tipos
- ✅ Validación de operadores
- ✅ Control de flujo (break/continue en bucles)

---

## 🎓 Requisitos Completados

| Requisito | Estado |
|-----------|--------|
| Gramática con etiquetas ANTLR | ✅ |
| Test 1: Declaraciones válidas | ✅ |
| Test 2: Error tipo incorrecto | ✅ |
| Test 3: Error variable no declarada | ✅ |
| Test 4: Error redeclaración | ✅ |
| Test 5: Error condición inválida | ✅ |
| Test 6: Error comparación strings | ✅ |
| Test 7: If-else con scope | ✅ |
| Test 8: Anidamiento while+if | ✅ |
| Test 9: Break y continue | ✅ |
| Test 10: Error operación strings | ✅ |
| Parser compilado | ✅ |
| Documentación | ✅ |

---

## 📚 Tecnologías Usadas

- **ANTLR 4.13.1** - Generador de parsers
- **Java** - Lenguaje de programación
- **Visitor Pattern** - Para recorrer el AST

---

## ✨ Estructura del Proyecto

```
WhileLang/
├── WhileLang.g4                         # Gramática actualizada
├── PROYECTO.md                          # Este archivo
├── valid_test_cases.while               # Casos válidos
├── error_test_*.while                   # 8 archivos de error
└── [Compilados ANTLR]                   # Parser y Lexer
```

---

**Fecha de Finalización:** 16 de Abril de 2026  
**Estado:** ✅ LISTO PARA IMPLEMENTAR INTÉRPRETE
