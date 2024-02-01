import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Productlistv1Component } from './productlistv1.component';

describe('Productlistv1Component', () => {
  let component: Productlistv1Component;
  let fixture: ComponentFixture<Productlistv1Component>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Productlistv1Component]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(Productlistv1Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
