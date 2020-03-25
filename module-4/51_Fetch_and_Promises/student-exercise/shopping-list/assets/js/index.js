
document.addEventListener('DOMContentLoaded', () => {  
    const loadListBtn = document.querySelector('.loadingButton');
    loadListBtn.addEventListener('click', (foo) => {
        const loadInput = 'assets/data/shopping-list.json';
        fetch(loadInput)
        .then((response) => {
            return response.json();
        })
        .then((data) => {
            if('content' in document.createElement('template')) {
            const main = document.querySelector('ul');
            data.forEach(( data ) => {
                let loadList = document.getElementById('shopping-list-item-template').content.cloneNode(true);
                loadList.querySelector('li').insertAdjacentHTML('afterbegin',data.name);
                if( data.completed ) {
                    const circleCheck = loadList.querySelector('.fa-check-circle');
                    circleCheck.className += " completed";
                }
                main.appendChild(loadList);
            });
        }
        })
        .catch((err) => {
            console.error(err);
        });
    }, {once : true});
});
