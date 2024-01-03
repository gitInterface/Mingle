formFile.onchange = function(event) {
    document.getElementById("formImg").style.visibility = "visible";
    const [file] = formFile.files;
    if (file) {
        formImg.src = URL.createObjectURL(file)
    }
}