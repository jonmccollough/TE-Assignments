let allItemsIncomplete = true;
const pageTitle = 'My Shopping List';
const groceries = [
  { id: 1, name: 'Oatmeal', completed: false },
  { id: 2, name: 'Milk', completed: false },
  { id: 3, name: 'Banana', completed: false },
  { id: 4, name: 'Strawberries', completed: false },
  { id: 5, name: 'Lunch Meat', completed: false },
  { id: 6, name: 'Bread', completed: false },
  { id: 7, name: 'Grapes', completed: false },
  { id: 8, name: 'Steak', completed: false },
  { id: 9, name: 'Salad', completed: false },
  { id: 10, name: 'Tea', completed: false }
];

/**
 * This function will get a reference to the title and set its text to the value
 * of the pageTitle variable that was set above.
 */
function setPageTitle() {
  const title = document.getElementById('title');
  title.innerText = pageTitle;
}

/**
 * This function will loop over the array of groceries that was set above and add them to the DOM.
 */
function displayGroceries() {
  const ul = document.querySelector('ul');
  groceries.forEach((item) => {
    const li = document.createElement('li');
    li.innerText = item.name;
    const checkCircle = document.createElement('i');
    checkCircle.setAttribute('class', 'far fa-check-circle');
    li.appendChild(checkCircle);
    ul.appendChild(li);
  });
}

document.addEventListener('DOMContentLoaded', () => {
  setPageTitle();
  displayGroceries();

  const complete = document.querySelectorAll('li');

  complete.forEach( (complete) => {
  complete.addEventListener('click', (event) => {
    makeCompleted(event.target, complete);
  });
});

complete.forEach( (complete) => {
  complete.addEventListener('dblclick', (event) => {
   makeUncompleted(event.target, complete);
  });
});

const button = document.getElementById('toggleAll');
button.addEventListener('click', (toggleAll));

});

function makeCompleted(complete) {
   if(!complete.classList.contains('completed')) {
   complete.classList.add('completed');
   }
} 

function makeUncompleted(complete) {
    if(complete.classList.contains('completed')) {
    complete.classList.remove('completed');
  }
}

function toggleAll() {
  let listItem = document.querySelectorAll('li');
  const button = document.getElementById('toggleAll');
  if(allItemsIncomplete) {
    listItem.forEach( (complete) => {
      complete.setAttribute("class", "completed");
    }); 
    allItemsIncomplete = false;
    button.innerText="Mark All Incomplete";
  } else if (!allItemsIncomplete){
    listItem.forEach( (complete) => {
     complete.classList.remove('completed');
    })
    allItemsIncomplete = true;
    button.innerText="Mark All Complete";
}
}
