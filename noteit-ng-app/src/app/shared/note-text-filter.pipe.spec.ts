import { NoteTextFilterPipe } from './note-text-filter.pipe';
import {Note} from '../notes/model/note';

describe('NoteTextFilterPipe', () => {
  it('create an instance', () => {
    const pipe = new NoteTextFilterPipe();
    expect(pipe).toBeTruthy();
  });

  it('should not filter notes if search text is empty', () => {
    // given
    const pipe = new NoteTextFilterPipe();
    const emptySearchText = '';
    const notes: Note[] = [
      {id: '1', title: 'title1', text: 'text1', notebookId: '10', lastModifiedOn: ''},
      {id: '2', title: 'title2', text: 'text2', notebookId: '10', lastModifiedOn: ''}
    ];

    // when
    const filteredNotes = pipe.transform(notes, emptySearchText);

    // then
    expect(filteredNotes.length).toBe(2);
  });

  it('should filter notes based on search text', () => {
    // given
    const pipe = new NoteTextFilterPipe();
    const searchText = 'text2';
    const notes: Note[] = [
      {id: '1', title: 'title1', text: 'text1', notebookId: '10', lastModifiedOn: ''},
      {id: '2', title: 'title2', text: 'text2', notebookId: '10', lastModifiedOn: ''}
    ];

    // when
    const filteredNotes = pipe.transform(notes, searchText);

    // then
    expect(filteredNotes.length).toBe(1);
    expect(filteredNotes[0].id).toBe('2');
  });

});
