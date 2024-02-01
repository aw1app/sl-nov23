import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NosuchComponent } from './nosuch.component';

describe('NosuchComponent', () => {
  let component: NosuchComponent;
  let fixture: ComponentFixture<NosuchComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [NosuchComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(NosuchComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
