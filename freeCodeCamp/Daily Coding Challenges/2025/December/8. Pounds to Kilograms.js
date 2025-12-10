function convertToKgs(lbs) {
    const poundToKilogramRatio = 0.453592
    const kgs = Math.round(lbs * poundToKilogramRatio * 100) / 100
    const pound = lbs === 1 ? "pound" : "pounds"
    const kilogram = kgs === 1 ? "kilogram" : "kilograms"
    
    return `${lbs} ${pound} equals ${kgs.toFixed(2)} ${kilogram}.`
}
