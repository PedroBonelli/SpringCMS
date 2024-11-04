import Content from '../models/Content.js'
import CreateContentButton from '../components/CreateContentButton.js'
import APIClient from '../api/APIClient.js'
import ContentPage from '../models/ContentPage.js'
import SaveContentPageButton from '../components/SaveContentPageButton.js'

const createH1ContentButton = new CreateContentButton('createH1Content', 'h1', 'pageCreationDiv')
const createH2ContentButton = new CreateContentButton('createH2Content', 'h2', 'pageCreationDiv')
const createPContentButton = new CreateContentButton('createPContent', 'p', 'pageCreationDiv')
const createAContentButton = new CreateContentButton('createAContent', 'a', 'pageCreationDiv')

const apiClient = new APIClient('http://localhost:8080/')

const saveContentButton = new SaveContentPageButton('salvarPagina', saveContentPage, apiClient)

async function saveContentPage(apiClient){
    let contentList = []

    const contents = document.querySelectorAll('.content')
    contents.forEach((content) => {
        const contentType = content.id.slice(0, content.id.indexOf('-')).toUpperCase();
        contentList.push(new Content(content.value, contentType));
    })

    const contentPage = new ContentPage(contentList);
    
    await apiClient.postContentPage(contentPage);
}






