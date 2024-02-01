import { TestBed } from '@angular/core/testing';

import { Productv1Service } from './productv1.service';

describe('Productv1Service', () => {
  let service: Productv1Service;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(Productv1Service);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
