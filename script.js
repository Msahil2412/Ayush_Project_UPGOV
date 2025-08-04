
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
center = center + 1;
function crtcents() {
    
    let center_name = document.getElementById('cname').value;
    let y = document.querySelector('.nocrt');
    y.classList.add('dis');
    let x = document.querySelector('.crtcen');
    x.classList.add('show');
    x.classList.remove('crtcen');
        let z = document.createElement('h3');
        let z2 = document.createElement('h3');
        z2.innerHTML=`Lottery For Purchase Center "${center_name}"`;
        z.innerHTML=`No. Of Applicants ${center} <br> <br> <br>`;
        let winner=0;
        while(winner===0)
        winner = Math.floor(Math.random() * center);

        let winhtml=document.createElement('h2')
        winhtml.innerHTML=`Winner Token Number is <h1> ${winner} </h1>`;

        x.appendChild(z2);
        x.appendChild(z);
        x.appendChild(winhtml);
}