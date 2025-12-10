function parseBold(markdown) {
    const bold = /\*\*|__/
    const re = new RegExp(`(?:${bold.source})(?!\\s)(.+?)(?<!\\s)(?:${bold.source})`, "g")
    
    return markdown.replace( re, "<b>$1</b>");
}
