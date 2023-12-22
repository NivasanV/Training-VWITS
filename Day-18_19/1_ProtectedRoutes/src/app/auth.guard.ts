import { inject } from '@angular/core';
import { CanActivateFn, Router } from '@angular/router';
import { UserService } from './user.service';

export const authGuard: CanActivateFn = (route, state) => {
  const service = inject(UserService);
  const r = inject(Router); // inject is used to do dependency injection
  if(service.isUserLoggedIn){
    return true;
  }
  else{
    r.navigate(['login'])
    return false;
  }
};
