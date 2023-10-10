import point.*
import polynomial.*
fun main() {

//ТОЧКИ
    val p1 = Point(1.0, 2.0)
    val p2 = Point(3.0, 4.0)

    println("p1: $p1")
    println("p2: $p2")

    p1.moveX(1.0)
    p1.moveY(2.0)
    println("p1 после перемещения по осям OX и OY: $p1")

    p1.move(1.0, 2.0)
    println("p1 после перемещения по осям OX и OY с помощью функции 'move': $p1")

    val distance = p1.distance()
    println("Расстояние от начала координат до p1: $distance")

    val p3 = p1 + p2
    println("p3 (результат сложения p1 и p2): $p3")

    val p4 = p1 * p2
    println("p4 (результат умножения p1 и p2): $p4")

    val p5 = p1 * 2.0
    println("p5 (результат умножения p1 на константу): $p5")

println("    ")
//ПОЛИНОМЫ
    val pol1 = Polynomial(listOf(1.0 to 0, 2.0 to 1, 3.0 to 2)) // 3x^2 + 2x + 1
    val pol2 = Polynomial(listOf(4.0 to 0, 5.0 to 1)) // 5x + 4

    println("pol1: $pol1")
    println("pol2: $pol2")

    println("Степень pol1: ${pol1.degree()}")

    println("p2: $p2")
    println("Степень pol2: ${pol2.degree()}")

    val pol3 = pol1 + pol2
    println("pol3 (результат сложения pol1 и pol2): $pol3")

    val pol4 = pol1 * pol2
    println("pol4 (результат умножения pol1 и pol2): $pol4")
}