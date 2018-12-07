import {getTestBed, TestBed} from '@angular/core/testing';

import {ApiService} from './api.service';
import {HttpClientTestingModule, HttpTestingController} from '@angular/common/http/testing';
import {Notebook} from '../notes/model/notebook';

describe('ApiService', () => {
  let httpMock: HttpTestingController;
  let apiService: ApiService;

  beforeEach(() => {
    TestBed.configureTestingModule({
      imports: [HttpClientTestingModule],
      providers: [ApiService]
    });

    httpMock = getTestBed().get(HttpTestingController);
    apiService = getTestBed().get(ApiService);
  });

  it('it is created', () => {
    expect(apiService).toBeTruthy();
  });

  it('should get all notebooks from http', () => {
    // given
    const dummyNotebooks: Notebook[] = [
      {id: '1', name: 'default', numberOfNotes: 0}
    ];

    // when
    apiService.getAllNotebooks().subscribe(res => {
      expect(res.length).toBe(1);
      expect(res).toEqual(dummyNotebooks);
    });

    // http mock
    const req = httpMock.expectOne(apiService.ALL_NOTEBOOKS_URL);
    expect(req.request.method).toBe('GET');
    req.flush(dummyNotebooks);

  });
});
