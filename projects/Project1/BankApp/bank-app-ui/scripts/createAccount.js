let account = document.getElementById("accno");
let bal = document.getElementById("b");
let form = document.getElementById("frm");
let create = document.getElementById("but");
// let valid = true;



create.addEventListener("click", function () {

    addAccount();
    alert("Account Created Succesfully");



});

async function addAccount() {



    let account = {
        accountNumber: form.accno.value,
        balance: form.b.value,
    };


    var options = {
        method: 'POST',
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify(account)
    };

        try {
            let response = await fetch("http://localhost:8080/bank-app-rest/accounts", options);

        } catch (err) {
        }
    
}