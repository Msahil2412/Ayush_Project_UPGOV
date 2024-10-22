
var flag = false;
var center = 0;

function check() {

    console.log("donee");

    let x = document.querySelector('#capplicant');
    console.dir(x);
    center = x.value;
    if (center == 0) {
        alert("Enter Some Applicants");
        return false;
    }
    else {
        flag = true;
        crtcents();
    }
}
function crtcents() {
    let y = document.querySelector('.nocrt');
    y.classList.add('dis');
    let x = document.querySelector('.crtcen');
    x.classList.add('show');
    x.classList.remove('crtcen');
    for (let i = 0; i < center; i++) {
        let z = document.createElement('input');
        z.type = 'text';
        z.name = 'centername';
        z.id = 'centername';
        x.appendChild(z);
    }
}