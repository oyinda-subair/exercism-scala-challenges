import scala.collection.mutable

object MatchingBrackets {
  def isPaired(brackets: String): Boolean = {
    val stack = new mutable.Stack[Char]
//    val brace = Map("(" -> ")", "[" -> "]", "{" -> "}")

    val openBraces = List('(', '[', '{')
//    val closeBraces = brace.values.toSeq

    val sanitizeBracket = brackets.replaceAll("[^({\\[}\\])]+","")

//    sanitizeBracket.foreach(e => {
//      if(brace.contains(e.toString)) stack.push(e)
//      else if (stack.isEmpty) return false
//      else if (!brace.get(stack.pop.toString).contains(e.toString)) return false
//    })

    sanitizeBracket.foreach(element => {
      if(openBraces.contains(element)) {
        stack.push(element)
      } else {
        if(stack.isEmpty) {
          return false
        }
        val currentBrace = stack.pop

        if(currentBrace == '('){
          if(element != ')') return false
        }

        if(currentBrace == '['){
          if(element != ']') return false
        }

        if(currentBrace == '{'){
          if(element != '}') return false
        }
      }
    })

    stack.isEmpty
  }
}

/*
Declare a character stack (say temp).
Now traverse the string exp.
If the current character is a starting bracket ( ‘(‘ or ‘{‘  or ‘[‘ ) then push it to stack.
If the current character is a closing bracket ( ‘)’ or ‘}’ or ‘]’ ) then pop from stack and if the popped character is the matching starting bracket then fine.
Else brackets are Not Balanced.
After complete traversal, if there is some starting bracket left in stack then Not balanced, else Balanced.
 */
/*
if current_char == '(':
                if char != ")":
                    return False
            if current_char == '{':
                if char != "}":
                    return False
            if current_char == '[':
                if char != "]":
                    return False
 */