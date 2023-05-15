val brace = Map("(" -> ")", "[" -> "]", "{" -> "}")

brace.contains("(")
brace.contains(")")
brace.values.exists(_ == ")")
brace.get("{").contains("}")

"{ }".replace("\\s", "")
"{ }".replaceAll("\\s", "")

"(((185 + 223.85) * 15) - 543)/2".replaceAll("[^({\\[}\\])]+","")

"""\left(\begin{array}{cc} \frac{1}{3} & x\ \mathrm{e}^{x} &... x^2 \end{array}\right)""".replaceAll("[^({\\[}\\])]+","")