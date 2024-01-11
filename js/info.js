formFile.onchange = function() {
    document.getElementById("formImg").style.display = "initial";
    document.getElementById("formImg").style.visibility = "visible";
    const [file] = formFile.files;
    if (file) {
        formImg.src = URL.createObjectURL(file);
    }
}

let cancel = document.getElementById("cancel");
cancel.onclick = function(){
    document.getElementById("email").value = "";
    document.getElementById("formFile").value="";
    document.getElementById("formImg").style.display = "none";
    document.getElementById("textarea").value = "";
}