function detectAI(text) {
    const len = text.length
    let dashes = 0;
    let openParenthesis = 0;
    let parentheses = 0;
    let longWord = 0;
    let punctuation = 0;
    let letterCount = 0;

    for (let i = 0; i < len; i++) {
        if (/[A-Za-z]/.test(text[i])) {
          letterCount++;
        } else {
            if (letterCount >= 7) {
              longWord++;
            }
            letterCount = 0;

            switch(text[i]) {
                case ' ':
                    break;
                case '-':
                    dashes++;
                    break;
                case '(':
                    openParenthesis++;
                    break;
                case ')':
                    if(openParenthesis > 0) {
                        openParenthesis--;
                        parentheses++;
                    }
                    break;
                default:
                    punctuation++;
            }
        }
    }
  
    if (letterCount >= 7) {
      longWord++;
    }

    if (dashes < 2 &&
      parentheses < 2 &&
      longWord < 3 &&
      punctuation !== 0
    ) {
      return "Human"
    } else {
      return "AI"
    }
}


