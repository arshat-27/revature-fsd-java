const urlParams = new URLSearchParams(window.location.search);
const currentAccountId = urlParams.get('id');



// let view = document.getElementById("Btn");

// for (let i =0; i < trans.length; i++){
//   trans[i].addEventListener("click", function(){
//     getTransactions();
//   });

// }
// view.addEventListener("click",function(){
//   console.log(currentAccountId);
//   getTransactions();

// });

(async function(){
  try {
      let response = await fetch("http://localhost:8080/bank-app-rest/transactions/"+ currentAccountId);
      let transactions = await response.json();
      let tran = "";
      let i =0;
      for(let transaction of transactions){
                 console.log(transaction.amount);
        tran +=` <div class="col-sm-6">
        <div class="card card text-white bg-dark mb-3">
          <div class="card-body ">
            <h5>Type : ${transaction.type}</h5>
           
            <div class="badge badge-danger">Balance : ${transaction.amount}</div><br><br>
          </div>
        </div>
      </div>`;
    }

    document.getElementById("transactions").innerHTML = tran;


  } catch{

  }
})();






// `<table class="table table-bordered ">
//         <thead>
//           <tr>
          
//             <th scope="col">Type</th>
//             <th scope="col">Amount</th>
            
//           </tr>
//         </thead>
//         <tbody>
//           <tr>
           
//             <td>${transaction.type}</td>
//             <td>${transaction.amount}</td>
           
//           </tr>
          
         
//         </tbody>
//       </table>`