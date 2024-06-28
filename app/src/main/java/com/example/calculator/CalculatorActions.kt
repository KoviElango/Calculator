package com.example.calculator

sealed class CalculatorActions {
    data class Number(val number:Int): CalculatorActions()
    data object Clear: CalculatorActions()
    data object Delete: CalculatorActions()
    data object Decimal: CalculatorActions()
    data object Calculate: CalculatorActions()
    data class Operation(val operation: CalculatorOperation): CalculatorActions()
}